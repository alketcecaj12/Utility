package hierarchical.clustering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2PrintClusters {

	
	public static void main (String[]args)throws Exception{
		
		String data = "8.007002146662824,45.70254127767198,0 7.904834723534295,45.69672467911268,0 7.850555499316974,45.67265973554378,0 7.862848980182601,45.61067189520367,0 7.912570840594788,45.58226103015898,0 7.985224970458635,45.58642588008123,0 8.0142838310081,45.58807884497328,0 8.070439891989105,45.60167026848207,0 8.122760974541352,45.6358787127154,0 8.225912294868255,45.71466369961167,0 8.366540133682731,45.83720414628315,0 8.333590201769932,45.85642202492531,0 8.304265333422219,45.85486300279604,0 8.254898138821631,45.79983399488199,0 8.205718081567323,45.7448850145088,0 8.156783130009394,45.68998289299901,0 8.126635481217585,45.61523792844578,0 8.177906313909153,45.57642998398918,0 8.201223854077565,45.60894844756595,0 8.164485963652925,45.6486278088056,0 8.104318456119389,45.65572592024964,0 8.029525760963187,45.66197736601115,0 7.944114239188574,45.64667760865703,0 7.866933301203913,45.59004536687189,0 7.860505673599967,45.54803172635503,0 7.951659741011632,45.53246430140212,0 8.053161325816765,45.53825090340151,0 8.121786211914158,45.5629052015139,0 8.126635481217585,45.61523792844578,0 8.135376571232273,45.64701479435318,0 8.125684238734742,45.69871962409741,0 8.07037519236005,45.75834182085422,0 8.028441790348179,45.7455427661037,0 7.936048040758543,45.6880435177093,0 7.935597692246281,45.61486783556494,0 8.024861711132159,45.60952321532785,0 8.108211007333505,45.63506767853877,0 8.154853205570177,45.70033343856131,0 8.191109224517675,45.74408791942918,0 8.137797242452844,45.79346315211317,0 8.097709371925529,45.77031965003588,0 8.048858726327433,45.71533539853242,0 8.025563974481731,45.68266147540211,0 8.022883812599822,45.61984041896469,0 8.065704961152351,45.54935619774281,0 8.127580292704552,45.53204605677596,0 8.20192887047131,45.5257979318398,0 8.259857248871379,45.52898687710011,0 8.357545913997599,45.55505864334655,0 8.377383011189908,45.60810353513938,0 8.384585018906348,45.6501518887257,0 8.379081678457014,45.68115342285411,0 8.355403340878475,45.7320649892295,0 8.30063902290447,45.79182647951443,0 8.220022320015071,45.82937217414672,0 8.159508126991298,45.83656689877262,0 8.073458428982345,45.82134800771649,0 8.033368853554848,45.7981555490406,0 7.980661495595721,45.76378142884962,0 7.932028311594195,45.70874056633974,0 7.942100339478277,45.65701236288568,0 8.010320541804257,45.60869902830286,0 8.08692405176526,45.59217800534589,0 8.115977464328044,45.59380475419509,0 8.21765150781529,45.59943825625801,0 8.271991546895078,45.62324064868624,0 8.27903041614908,45.66533587683215,0 8.286107917260374,45.70749240645606,0 8.273227167126432,45.77989660792338,0 8.238401378609462,45.80941366384052,0 8.157612906961644,45.84695239976416,0 8.113608058774345,45.84454169372453,0 8.088116868681162,45.82215916975321,0 8.05381952617762,45.76788229020266,0 8.061535421140336,45.72648883615959,0 8.060631309149542,45.65328109625839,0 8.124699041857264,45.62555576047678,0 8.213854527595393,45.62006196934501,0 8.255574600049025,45.6327681761585,0 8.302542218979728,45.69793766123913,0 8.307968156753692,45.75040944993523,0 8.280481354539994,45.82215037859347,0 8.265834203303324,45.82136437077151,0 8.148644138467247,45.81500730766149,0 8.075385647535128,45.81097137080224,0 8.007975686132824,45.77578595795635,0 7.961238739932639,45.71040071688787,0 7.96923992875781,45.66901445618473,0 7.995779532194113,45.60787353471235,0 8.068481268994713,45.61198335938317,0 8.085845496778919,45.67558959931278,0 8.094575024635935,45.70744306403443,0 8.112338101588412,45.77112804951385,0 8.115520581660146,45.83415639236206,0 8.065734489475238,45.86289631209125,0 8.025586766706018,45.83966833335203,0 7.991380562852664,45.78532690294156,0 7.973883469966278,45.72156522576717,0 7.960686609287615,45.6371797168071,0 7.956164416358991,45.58476537951727,0 8.003084851923759,45.49386067865483,0 8.081301020796252,45.46719656770017,0 8.141045989115511,45.46019992191229,0 8.186293701984464,45.45237455323149,0 8.303674294963004,45.44850382814296,0 8.375837230164008,45.45242477295903,0 8.41190097782949,45.49575589846077,0 8.426373543203813,45.57952066138896,0 8.413667243590519,45.65170010508476,0 8.371798290424108,45.72250523518039,0 8.269533467509563,45.80062169370497,0 8.207242788311524,45.81820094434312,0 8.177944446914706,45.81660812781418,0 8.104690393278599,45.81259169646633,0 8.066522959297691,45.77905584798744,0 8.063460705520418,45.71615107804895,0 8.067341756398252,45.69546885485405,0 11.31444311807893,43.92246370643957,0 11.26177673164444,43.90154092587304,0 11.2520369199399,43.84385188782147,0 11.28256412792245,43.78765652017848,0 11.33620579085224,43.78945118119282,0 11.40100385374631,43.82972394931614,0 11.39816299902569,43.87738689720609,0 11.408791963274,43.92558051102172,0 11.40538588194415,43.98300553143744,0 11.36311143721741,44.01043305242416,0 11.29551190717195,44.0081789724557,0 11.23044907243827,43.96755740326776,0 11.23484768717677,43.90062445992962,0 11.27646659206899,43.8829041242394,0 11.30337995745087,43.88380936241026,0 11.39645358438671,43.90602765849344,0 11.44591407677295,43.98432261110217,0 11.4448038204705,44.0034947911467,0 11.38727585458275,44.05933143432026,0 11.34664016708567,44.05798906854511,0 11.27953932708752,44.04611347816597,0 11.24206861354899,43.99675934186559,0 11.21822091247488,43.94795364427988,0 11.23484768717677,43.90062445992962,0 11.29052989540204,43.87381588980385,0 11.35721315481304,43.88560241761896,0 11.36777265589299,43.93381472101573,0 11.33784951779592,43.98077927644985,0 11.29672712294654,43.98900525546905,0 11.18931685956792,43.97574021858975,0 11.13797232464194,43.93558413593586,0 11.10158523907722,43.87686306667191,0 11.10762177545882,43.79115905334395,0 11.12235568019866,43.77262423873359,0 11.19126932526399,43.74646715185515,0 11.35369745652077,43.72342772207919,0 11.44734793641815,43.72649305552894,0 11.53843110082794,43.77694963585558,0 11.58956413086043,43.8261888855452,0 11.57211270773304,43.90206981908519,0 11.48914432561794,43.93775389737071,0 11.36719158004627,43.94337986726053,0 11.22453620008217,43.85246493655976,0 11.20084550101367,43.80393578299061,0 11.23268058971735,43.72886907182866,0 11.32516569752146,43.75100355440278,0 11.36186968464553,43.80936243032919,0 11.39702363932592,43.89647674235539,0 11.40822527973652,43.93514211802192,0 11.36369566823224,44.00084340885402,0 11.26847582720202,44.00726613444948,0 11.23233692190466,43.93885013857091,0 11.23735149333237,43.86245709088807,0 11.26547356183093,43.84430775810745,0 11.35896232494592,43.85698547876203,0 11.38298344951269,43.90558604499477,0 11.38067986808836,43.94382384534386,0 11.34959052763344,44.00998579121367,0 11.29975747688973,43.94113467735465,0 11.27646659206899,43.8829041242394,0 11.33266454348284,43.84656243005328,0 11.42507628724917,43.87826376332768,0 11.48914432561794,43.93775389737071,0 11.51347109474943,43.98648564785093,0 11.49781285263674,44.0244196807259,0 11.47348031243373,43.97561124154618,0 11.45033883759062,43.90777887988801,0 11.47836816486877,43.88954351131813,0 11.51665044727794,43.92904830493018,0 11.54101896863749,43.9777576619351,0 11.5363138159258,44.06413115401248,0 11.48211088579679,44.06240816183633,0 11.35135561396074,43.98122725050746,0 11.29975747688973,43.94113467735465,0 11.26485853935398,43.85383760862779,0 11.30638723288756,43.83613802484522,0 11.35721315481304,43.88560241761896,0 11.34139725362655,43.92336196663274,0 11.31444311807893,43.92246370643957,0 11.26424288540312,43.86337096357177,0 11.28073919093362,43.816192975068,0 11.34903285392433,43.79940547712581,0 11.42842796437005,43.82107614330892,0 11.45144133382129,43.88867880997022,0 11.39930049561857,43.85831092054055,0 11.39986870020353,43.84877819065203,0 12.62336855287664,46.37867229689355,0 12.59474738220356,46.29326716181201,0 12.60979827003816,46.27248667906957,0 12.63960058863983,46.25206946151043,0 12.71371051288334,46.24344627801438,0 12.84699816404972,46.26803103190449,0 12.81724714899399,46.28840733683636,0 12.75788201613039,46.28686271784496,0 12.69853876541963,46.28528766473157,0 12.58105707336502,46.20849624861238,0 12.62554550424581,46.18848603993244,0 12.68409255664667,46.24265549839053,0 12.69853876541963,46.28528766473157,0 12.68283284696149,46.38018147637943,0 12.57846834346142,46.39868193655055,0 12.51933292115808,46.37593500206056,0 12.49056081578586,46.3222947170343,0 12.47728234039175,46.23757786611298,0 12.50765710518199,46.18565127480655,0 12.59659535195914,46.14572385713746,0 12.6849568832023,46.14789372992324,0 12.80278918364529,46.20359623983817,0 12.86180936691401,46.27897451322339,0 12.86161593137561,46.36367233010567,0 12.80191852123366,46.3939674141391,0 12.72733960816657,46.40261424185993,0 12.54905194090092,46.37672651761267,0 12.50520577238074,46.33325321028751,0 12.5066491769864,46.24887431560153,0 12.53665771545407,46.21796394315444,0 12.65480846481064,46.2102372598673,0 12.77272129940157,46.28725164363017,0 12.89139985060604,46.36442906364414,0 12.9213159010201,46.46101610670836,0 12.86151258585994,46.5022628655376,0 12.71168659732463,46.53045184226298,0 12.6519061156715,46.51815000532038,0 12.62247016281512,46.47468576082486,0 12.62298584573582,46.41048373365046,0 12.66815410773119,46.35856982784603,0 12.71277854720947,46.35977548716969,0 12.77197076807514,46.42511724367508,0 12.78663280971086,46.51100281771452,0 12.75665079116519,46.52091892653525,0 12.62227406515159,46.49608391162897,0 12.51933292115808,46.37593500206056,0 12.49056081578586,46.3222947170343,0 12.52109392287141,46.2703480790853,0 12.63948613678373,46.26262465010402,0 12.75794842341628,46.27629473491083,0 12.75774891531618,46.30801189516519,0 12.75741534469574,46.36096479004631,0 12.68218101884007,46.46542122711573,0 12.56295447801543,46.4625117535265,0 12.41435366731021,46.42625110383858,0 12.31245757107975,46.32791927041846,0 12.31375037743544,46.27519043182058,0 12.41860811669474,46.21493770638178,0 12.59593763440772,46.19831592662904,0 12.74355030364005,46.21259565101653,0 12.77290232148239,46.25556026408776,0 12.77247924294031,46.32957052434398,0 12.75734843166646,46.37156891806914,0 12.66764686128025,46.41163898163666,0 12.59321484837861,46.40969955760534,0 12.47534604782175,46.34301682576471,0 12.41730927014485,46.27808741218556,0 12.41882396721088,46.20442782014357,0 12.47855026353975,46.16388661981851,0 12.65545441760174,46.14710751138628,0 12.84720846469112,46.19419433427676,0 12.95088562583797,46.2811977889783,0 12.98080842794213,46.37726427470723,0 12.93623822843771,46.45070916546018,0 12.81669808279534,46.44764135102746,0 12.72733960816657,46.40261424185993,0 12.6685666574816,46.31621051317874,0 12.6989911570338,46.2325039722498,0 12.72867798081008,46.22274599980751,0 12.78794154236535,46.21375229130079,0 12.87668809103575,46.25821991339939,0 12.95093459268431,46.32352182174856,0 12.98093795608331,46.4198008413541,0 12.89136397838807,46.41755496182244,0 12.80221012749562,46.33034679736682,0";
	   
		Map<Integer, Cluster> map = new HashMap<Integer,Cluster>();
	     ArrayList<Placemark> p_arr = new ArrayList<Placemark>();
	    
	     //ArrayList<Placemark> p_arrFF = new ArrayList<Placemark>();
		Placemark a = new Placemark(41.050266, 14.666887);
		Placemark b = new Placemark(41.055446,14.654902);
		System.out.println("dist euclid "+Placemark.distEuclid(a, b));   
	     
	     Placemark.loadData(data, p_arr); // carico i dati
	     //Placemark.loadDataFF("data/largeClusterData.txt", p_arrFF); // carico i dati
	     
	     
	     for (int i = 0; i < p_arr.size(); i++) {
	    	  
		    	System.out.println("--------------------------------"+p_arr.size());
		    	if(p_arr.size() == 0)
		    		break;
		    	Object[] c_rem = Cluster.cluster(i,p_arr);
				map.put(i, (Cluster)c_rem[0]);
				p_arr = (ArrayList<Placemark>)c_rem[1];
		       }
		
		 for(int id : map.keySet()) {
		    	System.out.println("********************************"+id+" = "+map.get(id).cluster.size());
		    	System.out.println(map.get(id));
		 }
		 
		 PrintClusters.print(map, "PrintClustersColori.kml");
		 
	}
}