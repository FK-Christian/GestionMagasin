package Gestion.passerelle;

import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import Gestion.controllers.ControlleurMetier.AddressControlleur;
import Gestion.controllers.ControlleurMetier.CategorieControlleur;
import Gestion.controllers.ControlleurMetier.ChargesControlleur;
import Gestion.controllers.ControlleurMetier.ClientControlleur;
import Gestion.controllers.ControlleurMetier.DetteControlleur;
import Gestion.controllers.ControlleurMetier.DroitAccessControlleur;
import Gestion.controllers.ControlleurMetier.FournisseurControlleur;
import Gestion.controllers.ControlleurMetier.ProduitControlleur;
import Gestion.controllers.ControlleurMetier.UtilisateurContrlleur;
import Gestion.controllers.ControlleurMetier.VenteControlleur;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class Passerelle {
    private JSONObject messageAtraiter;
    private UtilisateurMetier user;
    private int action;
    
    public Passerelle(JSONObject requette){
        try {
            this.messageAtraiter = (JSONObject) requette.get("message");
            this.user = (UtilisateurMetier) requette.get("user");
            this.action = Gestion.utils.Utils.ObjectToInt(requette.get("action"));
        } catch (Exception ex) {
            Gestion.utils.Utils.addMessage("Passerelle:passerelle: "+ex.toString(), true);
        }
    }
    
    @SuppressWarnings("UnusedAssignment")
    public JSONObject ForwardQuery(){
        String m = "L'utilisateur ";
        m += user.getNom()+" "+user.getPrenom()+" a effectuer une requette de type: "+Gestion.utils.Utils.getValeurAction(action);
        Gestion.utils.Utils.addMessage(m,false);
        
        JSONObject retour = new JSONObject();
        DroitAccessControlleur droit = new DroitAccessControlleur(user,action);
        if(droit.ALeDroit()){
            int typeAction = Gestion.utils.Utils.ContractTypeAction(action);
            switch(typeAction){
                case 1:{ // 0 1 2 23
                    FournisseurControlleur f = new FournisseurControlleur(action,messageAtraiter);
                    retour = f.getRetour();
                }
                break;
                case 2:{ // 3 4 5 24 30
                    UtilisateurContrlleur u = new UtilisateurContrlleur(action,messageAtraiter);
                    retour = u.getRetour();
                }
                break;
                case 3:{ // 6 7 8 12
                    ProduitControlleur p = new ProduitControlleur(action,messageAtraiter);
                    retour = p.getRetour();
                }
                break;
                case 4:{ // 9 10 11 13 31
                    VenteControlleur v = new VenteControlleur(action,messageAtraiter,user);
                    retour = v.getRetour();
                }
                break;
                case 5:{ // 14 15 16 26
                    AddressControlleur add = new AddressControlleur(action,this.messageAtraiter);
                    retour = add.getRetour();
                }
                break;
                case 6:{ // 17 18 19 27 -- 38 39 40 43
                    CategorieControlleur c = new CategorieControlleur(action,messageAtraiter);
                    retour = c.getRetour();
                }
                break;
                case 7:{ // 20 21 22 28
                    ClientControlleur cl = new ClientControlleur(action,messageAtraiter);
                    retour = cl.getRetour();
                }
                break;
                case 8:{ // 32 33 34 41
                    ChargesControlleur ch = new ChargesControlleur(action,messageAtraiter);
                    retour = ch.getRetour();
                }
                break;
                case 9:{ // 35 36 37 42
                    DetteControlleur cl = new DetteControlleur(action,messageAtraiter,user);
                    retour = cl.getRetour();
                }
                break;
                default:
                    retour.put("code",1);
                    retour.put("message","Vous n'avez pas le droit d'effectuer cette action");
                break;
            }
        }else{
            retour.put("code",1);
            retour.put("message","Vous n'avez pas le droit d'effectuer cette action Merci !!!");
        }
        return retour;
    }
}
