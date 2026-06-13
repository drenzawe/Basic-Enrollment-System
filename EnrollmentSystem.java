import javax.swing.JOptionPane;
public class EnrollmentSystem
{
	public static void main(String[]Drenz)
		{

		long no;	
		double discc=0;
		double cost=0;
		double change=0;
		double total=0;
		double CSF=23500;
		double ITF=21350;
		double BMF=20200;
		double ACTF=13550;
		double HRMF=26800;
		double HRSF=23233;
		int sec1;
		int age;
		int u1=0;
		int u2=0;
		int u3=0;
		int u4=0;
		int u5=0;
		int u6=0;
		int u7=0;
		int units=0;
		boolean seml=true;
		boolean passc=true;
		boolean z=false;
		boolean secc=false;
		boolean x=false;
		boolean cs=false;
		boolean it=false;
		boolean bm=false;
		boolean act=false;
		boolean hrm=false;
		boolean hrs=false;
		boolean paycs=false;
		boolean payit=false;
		boolean paybm=false;
		boolean payact=false;
		boolean payhrm=false;
		boolean payhrs=false;
		String sem="";
		String semn="";
		String semc="";
		String pass="";
		String cpass="";
		String cour="";
		String date="";
		String disc="";
		String fulln="";
		String scholar="";
		String ident="";
		String cname="";
		String course="";
		String sec="";
		String sec2="";
		String fn="";
		String mn="";
		String ln="";
		String addr="";
		String BSCS="";
		String BSIT="";
		String BSHRM="";
		String BSBM="";
		String ACT="";
		String HRS="";
		String subjects="";
		//HRM/HRS 101
		String BUSIMAT="\nBusiness Math = "+(u1+3);
		String COMART1="\nCommunication Arts 1 = "+(u6+3);
		String CULARTS="\nBasic Culinary Arts = "+(u2+3);
		String NSTP1="\nNational Service Training Program 1 = "+(u5+3);
		String PHYEDU1="\nPhysical Education 1 = "+(u4+2);
		String PRITUR1="\nPrinciples of Tourism 1 = "+(u3+3);
		String HRM1=BUSIMAT+COMART1+CULARTS+NSTP1+PHYEDU1+PRITUR1;
		String HRS1=HRM1;
		//HRM/HRS 201
		String COMART2="\nCommunication Arts 2 = "+(u6+3);
		String COMPFUND="\nComputer Fundamentals = "+(u3+3);
		String FILIP1="\nKomunikasyon sa Akademikong Filipino = "+(u1+3);
		String HRMELE1="\nHRM Elective 1 = "+(u2+3);
		String NSTP2="\nNational Service Training Program 2 = "+(u5+3);
		String PHYEDU2="\nPhysical Education 2 = "+(u4+2);
		String HRM2=COMART2+COMPFUND+FILIP1+HRMELE1+NSTP2+PHYEDU2;
		String HRS2=HRM2;
		//HRM/HRS 301
		String COMART3="\nCommunication Arts 3 = "+(u6+3);
		String FBSPROC="\nFood and Beverage Service Program = "+(u1+3);
		String FILIP2="\nPagpasa at Pagsulat Tungo sa Pananaliksik = "+(u2+3);
		String HRMELE2="\nHRM Elective 2 = "+(u3+3);
		String PRINMGT="\nPrinciples of Management = "+(u4+3);
		String PHYEDU3="\nPhysical Education 3 = "+(u5+2);
		String HRM3=COMART3+FBSPROC+FILIP2+HRMELE2+PRINMGT+PHYEDU3;
		String HRS3=HRM3;
		//HRM/HRS 401
		String BANCATE="\nBanquet, Function and Catering Procedure = "+(u1+3);
		String PROSTATA="\nProbability and Statistic = "+(u2+3);
		String HRMELE4="\nHRM Elective 4 = "+(u3+3);
		String HRMELE3="\nHRM Elective 3 = "+(u5+3);
		String PRINMKT="\nPrinciples of Marketing for the Service Industry = "+(u6+3);
		String PHYEDU4="\nPhysical Education 4 = "+(u4+2);
		String HRMOJT1="\nBSHRM Practicum 1 = "+(u7+3);
		String HRM4=BANCATE+PROSTATA+HRMELE3+HRMELE4+PRINMKT+PHYEDU4;
		String HRS4=HRM4;
		//HRM 501
		String PHILGOV="\nPhilippines History, Government and Constitution = "+(u1+3);
		String PHILLIT="\nPhilippine Literature = "+(u6+3);
		String HRMBEORG="\nHuman Behavior in the Organization = "+(u3+3);
		String RDMCONS="\nRooms Division Management and Control System = "+(u4+3);
		String BUSCOMM="\nBusiness Communication = "+(u5+3);
		String BACCTNG="\nBasic Accouting for the Service Industry = "+(u2+3);
		String HRM5=PHILGOV+PHILLIT+HRMBEORG+RDMCONS+BUSCOMM+BACCTNG;
		//HRM 601
		String BASFINA="\nBasic Finance for the Service Industry = "+(u1+3);
		String ENTRPHRM="\nEntreprenuership and Business Planning = "+(u2+3);
		String FOBECOM="\nFood and Beverage Control Management = "+(u3+3);
		String HRMELE5="\nHRM Elective 5 = "+(u4+3);
		String HRMELE6="\nHRM Elective 6 = "+(u5+3);
		String HRMENSCI="\nEnvironmental Science = "+(u6+3);
		String HRMOJT2="\nBSHRM Practicum 2 = "+(u7+3);
		String HRM6=BASFINA+ENTRPHRM+FOBECOM+HRMELE5+HRMELE6+HRMENSCI;
		//HRM 701
		String CULTANT="\nCultural Anthropology = "+(u1+3);
		String HRMELE7="\nHRM Elective 7 = "+(u2+3);
		String HRMELE8="\nHRM Elective 8 = "+(u3+3);
		String HRMEVMT="\nEvents Management = "+(u4+3);
		String HUMANT="\nHumanities = "+(u5+3);
		String JPRIZALA="\nLife and Works of Rizal = "+(u6+3);
		String HRM7=CULTANT+HRMELE7+HRMELE8+HRMEVMT+HUMANT+JPRIZALA;
		//HRM 801
		String HRMOJT3="\nBSHRM Practicum 3 = "+(u7+4);
		//CS/IT/ACT 101
		String ALGEBRA="\nAlgebra = "+(u1+3);
		String COPRO1="\nComputer Programming 1 = "+(u2+4);
		String CS1=ALGEBRA+COMART1+COMPFUND+PHYEDU1+COPRO1+NSTP1;
		String IT1=CS1;
		String ACT1=IT1;
		//CS/IT/ACT 201
		String COPRO2="\nComputer Programming 2 = "+(u1+4);
		String DATSRUC="\nData Structure = "+(u2+4);
		String TRIGONO="\nTrigonometry = "+(u3+3);
		String CS2=COMART2+PHYEDU2+NSTP2+COPRO2+DATSRUC+TRIGONO;
		String IT2=CS2;
		String ACT2=IT2;
		//CS/IT/ACT 301
		String COPRO3="\nComputer Programming 3 = "+(u1+4);
		String LOGSIGN="\nLogic Design and Switching = "+(u2+4);
		String CS3=COPRO3+LOGSIGN+COMART3+PHYEDU3+PROSTATA+PHILGOV;
		String IT3=CS3;
		String ACT3=IT3;
		//CS/IT/ACT 401
		String CORLANG="\nComputer Organization and Assembly Language = "+(u1+4);
		String SADSIGN="\nSystem Analysis and Design = "+(u2+3);
		String THEODBS="\nTheory of Database Systems = "+(u3+4);
		String COMART4="\nCommunication Arts 4 = "+(u6+3);
		String CS4=PHILLIT+PHYEDU4+CORLANG+SADSIGN+THEODBS+COMART4;
		String IT4=CS4;
		String ACT4=IT4;
		//CS 501
		String CSFELE1="\nCS Free Elective 1 = "+(u1+3);
		String CSFELE2="\nCS Free Elective 2 = "+(u2+3);
		String DESALGO="\nDesign and Analysis of Algorithms = "+(u3+3);
		String OPERSYS="\nOperating Systems = "+(u4+3);
		String SOFTWEN="\nSoftware Engineering = "+(u5+4);
		String THECOMP="\nTheory of Computation with Automata Theory = "+(u6+4);
		String CS5=CSFELE1+CSFELE2+DESALGO+OPERSYS+SOFTWEN+THECOMP;
		//CS 601
		String CALCLUS="\nCalculus = "+(u1+3);
		String COMNETS="\nComputer Networks = "+(u2+3);
		String CSTHES0B="\nCS Thesis Proposal = "+(u3+4);
		String MODESIM="\nModeling and Simulation = "+(u4+3);
		String WEBPROG="\nWeb Programming = "+(u5+3);
		String CSPRAC="\nCS Practicum = "+(u6+3);
		String CS6=CALCLUS+COMNETS+CSTHES0B+MODESIM+WEBPROG+CSPRAC;
		//CS 701
		String CSELE1="\nCS Elective 1 = "+(u1+3);
		String CSFELEB3="\nCS Free Elective 3 = "+(u2+3);
		String CSTHES1B="\nCS Thesis 1 = "+(u3+3);
		String GENPSYCA="\nPsychology with Drugs, HIV/AIDS and SARS Education = "+(u4+3);
		String PROLANS="\nProgramming Languages = "+(u5+3);
		String CS7=PHILLIT+CSELE1+CSFELEB3+CSTHES1B+GENPSYCA+PROLANS;
		//CS 801
		String CSELE2="\nCS Elective 2 = "+(u1+3);
		String CSTHES2B="\nCS Thesis 2 = "+(u2+3);
		String ECOTAXA="\nEconomics with Taxation and Agrarian Reform = "+(u3+3);
		String WORLLIT="\nWorld Literature = "+(u4+3);
		String CS8=JPRIZALA+CSELE2+CSTHES2B+ECOTAXA+WORLLIT;
		//IT 501
		String ADDBASE="\nAdvance Database Systems = "+(u1+3);
		String ITFELE1="\nIT Free Elective 1 = "+(u2+3);
		String WEBPROGIT="\nWeb Programming = "+(u3+3);
		String ACCPRIN="\nAccounting Principles = "+(u6+3);
		String IT5=OPERSYS+SOFTWEN+ADDBASE+ITFELE1+WEBPROGIT+ACCPRIN;
		//IT 601
		String ITELEC1="\nIT Elective 1 = "+(u1+3);
		String ITFELE2="\nIT Free Elective 2 = "+(u4+3);
		String MULTSYS="\nMultimedia Systems = "+(u5+4);
		String FILIP2IT="\nPagpasa at Pagsulat Tungo sa Pananaliksik = "+(u6+3);
		String IT6=COMNETS+ECOTAXA+FILIP2IT+ITELEC1+ITFELE2+MULTSYS;
		//IT 701
		String ITELEC2="\nIT Elective 2 = "+(u1+3);
		String ITFELE3="\nIT Free Elective 3 = "+(u2+3);
		String ITSPROJ="\nIT Special Project(Thesis) = "+(u3+3);
		String TECHNOP="\nTechnopreneurship = "+(u5+3);
		String IT7=GENPSYCA+PHILLIT+ITELEC2+ITFELE3+ITSPROJ+TECHNOP;
		//IT 801
		String ITPRACB="\nIT Practicum = "+(u1+6);
		String IT8=WORLLIT+JPRIZALA+ITPRACB;
		//BSBM 101
		String PRINMGTBM="\nPrinciples of Management = "+(u1+3);
		String COMFUNDBM="\nComputer Fundamentals = "+(u2+3);
		String BM1=PHYEDU1+COMART1+NSTP1+ALGEBRA+PRINMGTBM+COMFUNDBM;
		//BSBM 201
		String PRIMARK="\nPrinciples and Methods of Marketing = "+(u1+3);
		String VALFORM="\nValues Formation = "+(u3+3);
		String BM2=COMART2+NSTP2+PHYEDU2+PRIMARK+PROSTATA+VALFORM;
		//BSBM 301
		String ACCONT1="\nFundamentals of Accounting 1 = "+(u1+3);
		String BIOLOGY="\nGeneral Biology = "+(u2+3);
		String INTELCLRT="\nIntroduction to Economics with Land Reform and Taxation = "+(u3+3);
		String SCFPLAN="\nSociety and Culture with Family Planning = "+(u4+3);
		String BM3=COMART3+PHYEDU3+ACCONT1+BIOLOGY+INTELCLRT+SCFPLAN;
		//BSBM 401
		String ACCONT2="\nFundamentals of Accounting 2 = "+(u1+3);
		String BASFIN="\nBasic Finance = "+(u2+3);
		String INCTAX="\nIncome Taxation = "+(u3+3);
		String PHILOCT="\nIntroduction to Philosophy with Logic and Critical Thinking = "+(u5+3);
		String GOODGOV="\nSocial Responsibility and Good Governance = "+(u6+3);
		String BM4=PHYEDU4+BASFIN+ACCONT2+INCTAX+PHILOCT+GOODGOV;
		//BSBM 501
		String BAPROQT="\nProductivity and Quality Tools = "+(u1+3);
		String BMELEC1="\nBM Elective 1 = "+(u2+3);
		String BSBATQM="\nTotal Quality Management = "+(u3+3);
		String BUSIAPPA="\nBusiness Computer Applications = "+(u4+3);
		String ECONOMM="\nMicro and Macro Economics = "+(u5+3);
		String MATINVE="\nMathematics of Investment = "+(u6+3);
		String BM5=BAPROQT+BMELEC1+BSBATQM+BUSIAPPA+ECONOMM+MATINVE;
		//BSBM 601
		String BAOPINM="\nStrategic Operations and Management Information = "+(u1+3);
		String BMELEC2="\nBM Elective 2 = "+(u2+3);
		String BMELEC3="\nBM Elective 3 = "+(u3+3);
		String BUSICOM="\nBusiness Communications = "+(u4+3);
		String COSTACTA="\nCost Accounting = "+(u5+3);
		String OBLICON="\nLaw on Obligation and Contacts = "+(u6+3);
		String BM6=BAOPINM+BMELEC2+BMELEC3+BUSICOM+COSTACTA+OBLICON;
		//BSBM 701
		String ARTSSOC="\nArts, Man, and Society = "+(u1+3);
		String BAFACMT="\nFacilities Management = "+(u2+3);
		String BALOGMT="\nLogistic Management = "+(u3+3);
		String BMELEC4="\nBM Elective 4 = "+(u4+3);
	    String BMELEC5="\nBM Elective 5 = "+(u5+3);
	    String INVCONT="\nInventory and Control System Management = "+(u6+3);
	    String BM7=ARTSSOC+BAFACMT+BALOGMT+BMELEC4+BMELEC5+INVCONT;
	    //BSBM 801
	    String BSBMPRC="\nBusiness Operations Practicum = "+(u1+6);
	    String PROJMAN="\nProject Management = "+(u2+3);
	    String BM8=BSBMPRC+PROJMAN;
		
		JOptionPane.showMessageDialog(null,"Welcome to the STI Quezon Avenue Enrollment");
		JOptionPane.showMessageDialog(null,"Please fill up the following Information for your Enrollment");
		while(passc)
		{
			pass=JOptionPane.showInputDialog("Please register to continue");
			cpass=JOptionPane.showInputDialog("Confirm your password");
			
			if(pass.equals(cpass))
			{
				JOptionPane.showMessageDialog(null,"You successfully registered your password");
				JOptionPane.showMessageDialog(null,"Your password is: "+pass);
				z=true;
				passc=false;
			}
			else if(pass!=cpass)
			{
				JOptionPane.showMessageDialog(null,"Your password did not match");
			}
		}
		while(z)
		{
			fn=JOptionPane.showInputDialog("Enter your First Name");
			mn=JOptionPane.showInputDialog("Enter your Middle Name");
			ln=JOptionPane.showInputDialog("Enter your Last Name");
			age=Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
			addr=JOptionPane.showInputDialog("Home Address");
			no=Long.parseLong(JOptionPane.showInputDialog("Contact Number"));
			fulln="Full Name:"+fn+" "+mn.charAt(0)+"."+" "+ln;
			date=JOptionPane.showInputDialog("Enter the date today");
			JOptionPane.showMessageDialog(null,"Remember: You can only use either All Uppercase or All Lowercase\nYes=Y and No=N");
			cname=JOptionPane.showInputDialog(fulln+"\nAge:"+age+"\nAddress:"+addr+"\nContact No:"+no+"\nDate of Enroll:"+date+"\nAre you sure this is correct?(Y/N)");
			ident=fulln+"\nAge:"+age+"\nAddress:"+addr+"\nContact No:"+no;
			if(cname.equals("Y")||cname.equals("y"))
			{
				JOptionPane.showMessageDialog(null,fulln+"\nAge:"+age+"\nAddress:"+addr+"\nContact No:"+no+"\nDate of Enroll:"+date);
				seml=true;
				z=false;
			}
			else if(cname.equals("N")||cname.equals("n"))
			{
				z=true;
			}
		}
		while(seml)
		{
		    z=false;
			sem=JOptionPane.showInputDialog("Choose what semister you want to enroll?\n[1]1st Semister\n[2]2nd Semister");
			if(sem.equals("1"))
			{
				semc=JOptionPane.showInputDialog("Are you sure you want to enroll in 1st Semister?(Y/N)");
				if(semc.equals("Y")||semc.equals("y"))
				{
					JOptionPane.showMessageDialog(null,"You enrolled in 1st Semister");
				    semn="1st Semister";
					seml=false;
					x=true;
				}
				else if(semc.equals("N")||semc.equals("n"))
				{
					seml=true;
				}
			}
			else if(sem.equals("2"))
			{
				semc=JOptionPane.showInputDialog("Are you sure you want to enroll in 2nd Semister?(Y/N)");
				if(semc.equals("Y")||semc.equals("y"))
				{
					JOptionPane.showMessageDialog(null,"You enrolled in 2nd Semister");
					semn="2nd Semister";
					seml=false;
					x=true;
				}
				else if(semc.equals("N")||semc.equals("n"))
				{
					seml=true;
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid");
			}
		}
		while(x)
		{
			course=JOptionPane.showInputDialog("This is the courses available \n4 Year Courses\n[BSCS]Bachelor of Science in Computer Science\n[BSIT]Bachelor of Science in Information Technology\n[BSBM]Bachelor of Science in Business Management\n[BSHRM]Bachelor of Science in Hotel and Restaurant Management\n2 Year Courses\n[ACT]Associate in Computer Technology\n[HRS]Hospitality and Restaurant Services");
					if(course.equals("BSCS")||course.equals("bscs"))
					{
						secc=true;
						cour="Bachelor of Science in Computer Science";
						JOptionPane.showMessageDialog(null,"Course:BSCS");
						BSCS=JOptionPane.showInputDialog("Are you sure you want to enroll to BSCS course?(Y/N)");
						if(BSCS.equals("Y")||BSCS.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401\n[5]501\n[6]601\n[7]701\n[8]801"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS1+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					subjects=CS2;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS2+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS3;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS3+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=4;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS4;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS4+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==5)
			{
				sec="501";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=4;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS5;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS5+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==6)
			{
				sec="601";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS6;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS6+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==7)
			{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
				sec="701";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					subjects=CS7;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS7+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==8)
			{
				sec="801";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=0;
					units=u1+u2+u3+u4+u5+u6;
					subjects=CS8;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for CS"+sec+CS8+"\nTotal Units:"+units);
					cs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:BSCS"+sec);
							while(cs)
							{
							JOptionPane.showMessageDialog(null,"Course:\nBachelor of Science in Computer Science\nTuition Fee:P"+CSF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(CSF*.40);
								total=CSF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								cs=false;
								x=false;
								paycs=true;
								while(paycs)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSCS"+sec+"\nUnits:"+units+"\nTuition Fee:P"+CSF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);
								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								paycs=true;
								x=false;
								cs=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=CSF;
							    paycs=true;
								x=false;
								cs=false;
								while(paycs)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSCS"+sec+"\nUnits:"+units+"\nTuition Fee:P"+CSF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								paycs=true;
								x=false;
								cs=false;
							}
							}
							}
							}
						}
						else if(BSCS.equals("N")||BSCS.equals("n"))
						{
							x=true;
						}
					}
					else if(course.equals("BSIT")||course.equals("bsit"))
					{
						secc=true;
						cour="Bachelor of Science in Information Technology";
						JOptionPane.showMessageDialog(null,"Course:BSIT");
						BSIT=JOptionPane.showInputDialog("Are you sure you want to enroll to BSIT course?(Y/N)");
						if(BSIT.equals("Y")||BSIT.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401\n[5]501\n[6]601\n[7]701\n[8]801"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT1+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{

				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT2;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT2+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT3;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT3+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=4;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT4;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT4+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==5)
			{
				sec="501";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT5;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT5+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==6)
			{
				sec="601";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT6;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT6+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==7)
			{
				sec="701";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=IT7;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT7+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==8)
			{
				sec="801";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=6;
					u2=3;
					u3=3;
					units=u1+u2+u3;
					subjects=IT8;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for IT"+sec+IT8+"\nTotal Units:"+units);
					it=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:BSIT"+sec);
							while(it)
							{
							JOptionPane.showMessageDialog(null,"Course:\nBachelor of Science in Information Technology\nTuition Fee:P"+ITF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(ITF*.40);
								total=ITF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								it=false;
								x=false;
								payit=true;
								while(payit)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSIT"+sec+"\nUnits:"+units+"\nTuition Fee:P"+ITF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payit=true;
								x=false;
								it=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=ITF;
								payit=true;
								x=false;
								it=false;
								while(payit)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSIT"+sec+"\nUnits:"+units+"\nTuition Fee:P"+ITF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payit=true;
								x=false;
								it=false;
							}
							}
							}
							}
						}
						else if(BSIT.equals("N")||BSIT.equals("n"))
						{
							x=true;
						}
					}
					else if(course.equals("BSBM")||course.equals("bsbm"))
					{
						secc=true;
						cour="Bachelor of Science in Business Management";
						JOptionPane.showMessageDialog(null,"Course:BSBM");
						BSBM=JOptionPane.showInputDialog("Are you sure you want to enroll to BSBM course?(Y/N)");
						if(BSBM.equals("Y")||BSBM.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401\n[5]501\n[6]601\n[7]701\n[8]801"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=2;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM1+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{
				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=2;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM2;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM2+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=2;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM3;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM3+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=2;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM4;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM4+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==5)
			{
				sec="501";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM5;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM5+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==6)
			{
				sec="601";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM6;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM6+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==7)
			{
				sec="701";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=BM7;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM7+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==8)
			{
				sec="801";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=6;
					u2=3;
					units=u1+u2;
					subjects=BM8;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for BM"+sec+BM8+"\nTotal Units:"+units);
					bm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:BSBM"+sec);
							while(bm)
							{
							JOptionPane.showMessageDialog(null,"Course:\nBachelor of Science in Business Management\nTuition Fee:P"+BMF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(BMF*.40);
								total=BMF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								bm=false;
								x=false;
								paybm=true;
								while(paybm)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSBM"+sec+"\nUnits:"+units+"\nTuition Fee:P"+BMF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								paybm=true;
								x=false;
								bm=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=BMF;
								paybm=true;
								x=false;
								bm=false;
								while(paybm)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSBM"+sec+"\nUnits:"+units+"\nTuition Fee:P"+BMF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								paybm=true;
								x=false;
								bm=false;
							}
							}
							}
							}
						}
						else if(BSBM.equals("N")||BSBM.equals("n"))
						{
							x=true;
						}
					}
					else if(course.equals("BSHRM")||course.equals("bshrm"))
					{
						secc=true;
						cour="Bachelor of Science in Hotel and Restaurant Management";
						JOptionPane.showMessageDialog(null,"Course:BSHRM");
						BSHRM=JOptionPane.showInputDialog("Are you sure you want to enroll to BSHRM course?(Y/N)");
						if(BSHRM.equals("Y")||BSHRM.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401\n[5]501\n[6]601\n[7]701\n[8]801"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRM1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM1+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{
				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRM2;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM2+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRM3;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM3+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					u7=3;
					units=u1+u2+u3+u4+u5+u6+u7;
					subjects=HRM4;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM4+"\nOJT"+HRMOJT1+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==5)
			{
				sec="501";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRM5;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM5+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==6)
			{
				sec="601";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					u7=3;
					units=u1+u2+u3+u4+u5+u6+u7;
					subjects=HRM6;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM6+"\nOJT"+HRMOJT2+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==7)
			{
				sec="701";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=3;
					u6=3;
					u7=3;
					units=u1+u2+u3+u4+u5+u6+u7;
					subjects=HRM7;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+HRM7+"\nTotal Units:"+units+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==8)
			{
				sec="801";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u7=3;
					units=u7;
					subjects=HRMOJT3;
		            JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRM"+sec+"\nOJT"+HRMOJT3+"\nTotal Units:"+units+"\nTotal Units:"+units);
					hrm=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:BSHRM"+sec);
							while(hrm)
							{
							JOptionPane.showMessageDialog(null,"Course:\nBachelor of Science in Hotel and Restaurant Management\nTuition Fee:P"+HRMF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(HRMF*.40);
								total=HRMF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								hrm=false;
								x=false;
								payhrm=true;
								while(payhrm)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSHRM"+sec+"\nUnits:"+units+"\nTuition Fee:P"+HRMF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payhrm=true;
								x=false;
								bm=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=HRMF;
								payhrm=true;
								x=false;
								hrm=false;
								while(payhrm)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:BSHRM"+sec+"\nUnits:"+units+"\nTuition Fee:P"+HRMF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nUnits:"+units+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);
								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payhrm=true;
								x=false;
								bm=false;
							}
							}
							}
							}
						}
						else if(BSHRM.equals("N")||BSHRM.equals("n"))
						{
							x=true;
						}
					}
					else if(course.equals("ACT")||course.equals("act"))
					{
						secc=true;
						cour="Associate in Computer Technology";
						JOptionPane.showMessageDialog(null,"Course:ACT");
						ACT=JOptionPane.showInputDialog("Are you sure you want to enroll to ACT course?(Y/N)");
						if(ACT.equals("Y")||ACT.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=3;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=ACT1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for ACT"+sec+ACT1+"\nTotal Units:"+units);
					act=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{
				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=ACT2;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for ACT"+sec+ACT2+"\nTotal Units:"+units);
					act=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=2;
					u3=4;
					u4=4;
					u5=3;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=ACT3;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for ACT"+sec+ACT3+"\nTotal Units:"+units);
					act=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=4;
					u4=4;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=ACT4;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for ACT"+sec+ACT4+"\nTotal Units:"+units);
					act=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:ACT"+sec);
							while(act)
							{
							JOptionPane.showMessageDialog(null,"Course:\nAssociate in Computer Technology\nTuition Fee:P"+ACTF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(ACTF*.40);
								total=ACTF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								act=false;
								x=false;
								payact=true;
								while(payact)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:ACT"+sec+"\nUnits:"+units+"\nTuition Fee:P"+ACTF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payact=true;
								x=false;
								act=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=ACTF;
								payact=true;
								x=false;
								act=false;
								while(payact)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:ACT"+sec+"\nUnits:"+units+"\nTuition Fee:P"+ACTF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payact=true;
								x=false;
								act=false;
							}
							}
							}
							}
						}
						else if(ACT.equals("N")||ACT.equals("n"))
						{
							x=true;
						}
					}
					else if(course.equals("HRS")||course.equals("hrs"))
					{
						secc=true;
						cour="Hospitality and Restaurant Services";
						HRS=JOptionPane.showInputDialog("Are you sure you want to enroll to HRS course?(Y/N)");
						if(HRS.equals("Y")||HRS.equals("y"))
						{
		while(secc)
		{
			sec1=Integer.parseInt(JOptionPane.showInputDialog("What Section? \n[1]101\n[2]201\n[3]301\n[4]401"));
			if(sec1==1)
			{
				sec="101";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRS1;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRS"+sec+HRS1+"\nTotal Units:"+units);
					hrs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==2)
			{
				sec="201";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRS2;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRS"+sec+HRS2+"\nTotal Units:"+units);
					hrs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==3)
			{
				sec="301";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRS3;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRS"+sec+HRS3+"\nTotal Units:"+units);
					hrs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
			else if(sec1==4)
			{
				sec="401";
				sec2=JOptionPane.showInputDialog("Are you sure your section is "+sec+"(Y/N)");
				if(sec2.equals("Y")||sec2.equals("y"))
				{
					u1=3;
					u2=3;
					u3=3;
					u4=3;
					u5=2;
					u6=3;
					units=u1+u2+u3+u4+u5+u6;
					subjects=HRS4;
					JOptionPane.showMessageDialog(null,"This is the Subject and Units for HRS"+sec+HRS4+"\nTotal Units:"+units);
					hrs=true;
					secc=false;
				}
				else if(sec2.equals("N")||sec2.equals("n"))
				{
					secc=true;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Course/Sec:HRS"+sec);
							while(hrs)
							{
							JOptionPane.showMessageDialog(null,"Course:\nHospitality and Restaurant Services\nTuition Fee:P"+HRSF);
							scholar=JOptionPane.showInputDialog("Are you a Scholar?(Y/N)");
							if(scholar.equals("Y")||scholar.equals("y"))
							{
								disc="Yes";
								discc=(HRSF*.40);
								total=HRSF;
								JOptionPane.showMessageDialog(null,"You have 40% discount");
								total=(total-discc);
								JOptionPane.showMessageDialog(null,"You discounted:P"+discc+"\nYour balance is now:P"+total);
								hrs=false;
								x=false;
								payhrs=true;
								while(payhrs)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:HRS"+sec+"\nUnits:"+units+"\nTuition Fee:P"+HRSF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payhrs=true;
								x=false;
								hrs=false;
							}
							}
							}
							else if(scholar.equals("N")||scholar.equals("n"))
							{
								disc="No";
								total=HRSF;
								payhrs=true;
								x=false;
								hrs=false;
								while(payhrs)
								{
							cost=Double.parseDouble(JOptionPane.showInputDialog("Tuition Fee:P"+total+"\nEnter amount to pay"));
							if(cost>=total)
							{
								change=cost-total;
								JOptionPane.showMessageDialog(null,"Total\nCourse/Section:HRS"+sec+"\nUnits:"+units+"\nTuition Fee:P"+HRSF+"\nScholar:"+disc+"\nAmount Discounted:P"+discc+"\nChange:P"+change);
								JOptionPane.showMessageDialog(null,"Registration Complete!");
								JOptionPane.showMessageDialog(null,ident+"\nCourse:"+cour+"\nSection:"+sec+"\nScholar:"+disc+"\nSemister:"+semn+"\nSubjects:"+subjects+"\nUnits:"+units+"\nAmount Paid:"+total+"\nStatus:Enrolled\nDate of Enrolled:"+date);								System.exit(0);
							}
							else if(cost<total)
							{
								JOptionPane.showMessageDialog(null,"Your cash is not enough to pay Tuition Fee!");
								payhrs=true;
								x=false;
								hrs=false;
							}
							}
							}
							}
						}
						else if(HRS.equals("N")||HRS.equals("n"))
						{
							x=true;
						}
			}
		}
	}
}