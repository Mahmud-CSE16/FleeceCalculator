package com.example.fleececalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CalculateAndResultActivity extends AppCompatActivity {

    TextView amount_of_base_needed,amount_of_binder_needed,amount_of_loop_needed,amount_of_base_needed_with_waste_percentage,amount_of_binder_needed_with_waste_percentage,amount_of_loop_needed_with_waste_percentage,base_count,base_stitch_length,
             binder_count,binder_stitch_length,loop_count,loop_stitch_length;

    ListView listView;
    double a1,a2,a3,a4,a5,a6,a7,a8,a9=1,a10,a11,a12,a13,a14,a15,a16,a17,a18;
    double kk,cc,ccc,xxx ;

    String gsm,cotton,amount,color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_and_result);

        FindViewById();


        //get extras
        Bundle bundle = getIntent().getExtras();
        a1 = bundle.getInt("a1");
        gsm = bundle.getString("gsm");
        cotton = bundle.getString("cotton");
        amount = bundle.getString("amount");
        color = bundle.getString("color");

        calculate();

    }

    private void calculate(){
        a2 = Integer.parseInt(gsm);
        a10 = Integer.parseInt(cotton);
        a11 = Integer.parseInt(amount);

        if(a1==1){
            if(a2==	235	){	a3 =	30	;	a4=	70.86	;	a5=	30	;	a6=	4.6	;	a7=	3	;	a8=	1.52	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	70.86	;	a5=	20	;	a6=	4.8	;	a7=	3.2	;	a8=	1.65	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	4.6	;	a7=	3.3	;	a8=	1.6	;	a9=0	;	}
            if(a2==	250	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	4.6	;	a7=	3.3	;	a8=	1.6	;	a9=0	;	}
            if(a2==	255	){	a3 =	30	;	a4=	70.86	;	a5=	0.13	;	a6=	4.75	;	a7=	3.35	;	a8=	1.55	;	a9=0	;	}
            if(a2==	255	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	4.6	;	a7=	3.3	;	a8=	1.6	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	70.86	;	a5=	26	;	a6=	4.4	;	a7=	3.5	;	a8=	1.6	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.15	;	a8=	1.55	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	3.5	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	53.15	;	a5=	26	;	a6=	4.4	;	a7=	3.5	;	a8=	1.6	;	a9=0	;	}
            if(a2==	265	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.15	;	a8=	1.55	;	a9=0	;	}
            if(a2==	267	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	270	){	a3 =	30	;	a4=	70.86	;	a5=	0.13	;	a6=	4.7	;	a7=	3.3	;	a8=	1.55	;	a9=0	;	}
            if(a2==	270	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	275	){	a3 =	30	;	a4=	70.86	;	a5=	16	;	a6=	4.6	;	a7=	3	;	a8=	1.5	;	a9=0	;	}
            if(a2==	275	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.55	;	a7=	3.15	;	a8=	1.7	;	a9=0	;	}
            if(a2==	275	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	275	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.15	;	a8=	1.7	;	a9=0	;	}
            if(a2==	276	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	277	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	278	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	278	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	280	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.5	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	280	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	3.5	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	280	){	a3 =	30	;	a4=	53.15	;	a5=	15	;	a6=	4.6	;	a7=	2.8	;	a8=	1.5	;	a9=0	;	}
            if(a2==	280	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	282	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.45	;	a7=	2.85	;	a8=	1.5	;	a9=0	;	}
            if(a2==	282	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.45	;	a7=	2.85	;	a8=	1.5	;	a9=0	;	}
            if(a2==	297	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	297	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	297	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	300	){	a3 =	30	;	a4=	53.15	;	a5=	13	;	a6=	4.5	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	302	){	a3 =	30	;	a4=	53.15	;	a5=	0.8	;	a6=	4.5	;	a7=	3.15	;	a8=	1.55	;	a9=0	;	}
            if(a2==	302	){	a3 =	30	;	a4=	53.15	;	a5=	0.8	;	a6=	4.5	;	a7=	3.15	;	a8=	1.55	;	a9=0	;	}
            if(a2==	302	){	a3 =	30	;	a4=	53.15	;	a5=	13	;	a6=	4.5	;	a7=	3.15	;	a8=	1.55	;	a9=0	;	}
            if(a2==	305	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	4.47	;	a7=	2.77	;	a8=	1.53	;	a9=0	;	}
            if(a2==	305	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.45	;	a7=	2.85	;	a8=	1.5	;	a9=0	;	}
            if(a2==	305	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.45	;	a7=	2.85	;	a8=	1.5	;	a9=0	;	}
            if(a2==	310	){	a3 =	30	;	a4=	53.15	;	a5=	20	;	a6=	4.47	;	a7=	2.77	;	a8=	1.53	;	a9=0	;	}
            if(a2==	325	){	a3 =	30	;	a4=	53.15	;	a5=	0.1	;	a6=	4.6	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	330	){	a3 =	30	;	a4=	53.15	;	a5=	16	;	a6=	4.6	;	a7=	2.8	;	a8=	1.5	;	a9=0	;	}
            if(a2==	335	){	a3 =	30	;	a4=	53.15	;	a5=	0.1	;	a6=	4.6	;	a7=	3.1	;	a8=	1.55	;	a9=0	;	}
            if(a2==	360	){	a3 =	30	;	a4=	53.15	;	a5=	0.1	;	a6=	4.6	;	a7=	3	;	a8=	1.55	;	a9=0	;	}
            if(a2==	380	){	a3 =	30	;	a4=	53.15	;	a5=	0.8	;	a6=	4.55	;	a7=	3.15	;	a8=	1.7	;	a9=0	;	}
        }
        if(a1==2){
            if(a2==	160	){	a3 =	40	;	a4=	40	;	a5=	40	;	a6=	4.6	;	a7=	4	;	a8=	1.5	;	a9=0	;	}
            if(a2==	180	){	a3 =	40	;	a4=	40	;	a5=	40	;	a6=	4.5	;	a7=	3.2	;	a8=	1.5	;	a9=0	;	}
            if(a2==	190	){	a3 =	34	;	a4=	34	;	a5=	34	;	a6=	4.5	;	a7=	3.9	;	a8=	1.55	;	a9=0	;	}
            if(a2==	200	){	a3 =	34	;	a4=	34	;	a5=	34	;	a6=	4.5	;	a7=	3.8	;	a8=	1.55	;	a9=0	;	}
            if(a2==	210	){	a3 =	30	;	a4=	30	;	a5=	30	;	a6=	4.6	;	a7=	3.7	;	a8=	1.55	;	a9=0	;	}
            if(a2==	220	){	a3 =	30	;	a4=	30	;	a5=	30	;	a6=	4.6	;	a7=	3.7	;	a8=	1.55	;	a9=0	;	}
            if(a2==	230	){	a3 =	30	;	a4=	30	;	a5=	30	;	a6=	4.5	;	a7=	3.7	;	a8=	1.75	;	a9=0	;	}
            if(a2==	230	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	3.9	;	a8=	1.75	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	30	;	a5=	20	;	a6=	4.6	;	a7=	3.6	;	a8=	1.6	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	30	;	a5=	24	;	a6=	4.6	;	a7=	4	;	a8=	1.55	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	30	;	a5=	26	;	a6=	4.6	;	a7=	3.9	;	a8=	1.55	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	30	;	a5=	20	;	a6=	4.6	;	a7=	3.9	;	a8=	1.7	;	a9=0	;	}
            if(a2==	240	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	4.1	;	a8=	1.6	;	a9=0	;	}
            if(a2==	250	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	3.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	30	;	a5=	20	;	a6=	4.5	;	a7=	3.5	;	a8=	1.58	;	a9=0	;	}
            if(a2==	260	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	4.1	;	a8=	1.6	;	a9=0	;	}
            if(a2==	265	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	3.9	;	a8=	1.6	;	a9=0	;	}
            if(a2==	270	){	a3 =	30	;	a4=	30	;	a5=	26	;	a6=	4.4	;	a7=	3.2	;	a8=	1.6	;	a9=0	;	}
            if(a2==	275	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	4.1	;	a8=	1.6	;	a9=0	;	}
            if(a2==	280	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	3.6	;	a8=	1.55	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.38	;	a7=	3.45	;	a8=	1.57	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	24	;	a6=	4.5	;	a7=	3.3	;	a8=	1.51	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.5	;	a7=	3.3	;	a8=	1.6	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.5	;	a7=	3.4	;	a8=	1.6	;	a9=0	;	}
            if(a2==	290	){	a3 =	34	;	a4=	34	;	a5=	16	;	a6=	4.6	;	a7=	4.2	;	a8=	1.55	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	4.1	;	a8=	1.6	;	a9=0	;	}
            if(a2==	290	){	a3 =	30	;	a4=	30	;	a5=	16	;	a6=	4.6	;	a7=	3.9	;	a8=	1.6	;	a9=0	;	}
            if(a2==	300	){	a3 =	30	;	a4=	30	;	a5=	0.1	;	a6=	4.7	;	a7=	3.3	;	a8=	1.7	;	a9=0	;	}
            if(a2==	335	){	a3 =	30	;	a4=	30	;	a5=	0.1	;	a6=	4.6	;	a7=	3.9	;	a8=	1.6	;	a9=0	;	}
        }
        if(a9==1) {
            Toast.makeText(this,"GSM data not found",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, InputActivity.class);
            intent.putExtra("a1",a1);
            startActivity(intent);
            finish();
        }else{
            a12=a6/a3 ;
            a13=a7/a4 ;
            a14=a8/a5 ;

            a15= a12+a13+a14 ;

            a16=a12/a15*100 ;
            a17=a13/a15*100 ;
            a18=a14/a15*100 ;

            double abn = (a11*a16)/100;
            double abin = (a11*a17)/100;
            double aln = (a11*a18)/100;

            amount_of_base_needed.setText("Ammount of base needed = "+(Math.floor(abn*100)/100)+" kg");
            amount_of_binder_needed.setText("Ammount of binder needed = "+(Math.floor(abin*100)/100)+" kg");
            amount_of_loop_needed.setText("Ammount of loop needed = "+(Math.floor(aln*100)/100)+" kg");

            if(color.equals("Light")){
                amount_of_base_needed_with_waste_percentage.setText("Ammount of base needed = "+(Math.floor((abn+abn*.08)*100)/100)+" kg");
                amount_of_binder_needed_with_waste_percentage.setText("Ammount of binder needed = "+(Math.floor((abin+abin*.08)*100)/100)+" kg");
                amount_of_loop_needed_with_waste_percentage.setText("Ammount of loop needed = "+(Math.floor((aln+aln*.08)*100)/100)+" kg");
            }else if(color.equals("Medium")){
                amount_of_base_needed_with_waste_percentage.setText("Ammount of base needed = "+(Math.floor((abn+abn*.12)*100)/100)+" kg");
                amount_of_binder_needed_with_waste_percentage.setText("Ammount of binder needed = "+(Math.floor((abin+abin*.12)*100)/100)+" kg");
                amount_of_loop_needed_with_waste_percentage.setText("Ammount of loop needed = "+(Math.floor((aln+aln*.12)*100)/100)+" kg");
            }else if(color.equals("Dark")){
                amount_of_base_needed_with_waste_percentage.setText("Ammount of base needed = "+(Math.floor((abn+abn*.16)*100)/100)+" kg");
                amount_of_binder_needed_with_waste_percentage.setText("Ammount of binder needed = "+(Math.floor((abin+abin*.16)*100)/100)+" kg");
                amount_of_loop_needed_with_waste_percentage.setText("Ammount of loop needed = "+(Math.floor((aln+aln*.16)*100)/100)+" kg");
            }

            base_count.setText("Base Count = "+Math.floor(a3*100)/100+" S");
            binder_count.setText("Binder Count = "+Math.floor(a4*100)/100+" S");
            loop_count.setText("Loop Count = "+Math.floor(a5*100)/100+" S");

            base_stitch_length.setText("Base stitch length = "+ Math.floor(a6*100)/100+" mm");
            binder_stitch_length.setText("Binder stitch length = "+ Math.floor(a7*100)/100+" mm");
            loop_stitch_length.setText("Loop stitch length = "+ Math.floor(a8*100)/100+" mm");

            List<Double> kks = new ArrayList<>();
            List<Double> ccs = new ArrayList<>();
            List<Double> cccs = new ArrayList<>();


//            for(kk=1;kk<=100;kk++)
//            {
//                for(cc=1;cc<=100;cc++)
//                {
//                    for(ccc=1;ccc<=100;ccc++)
//                    {
//                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);
//
//                        if ( xxx == a10)
//                        {
//                            kks.add(kk);
//                            ccs.add(cc);
//                            cccs.add(ccc);
//
//                        }
//                    }
//
//                }
//
//            }


            int y =10;
            /*1 */

            for(kk=1;kk<=100;kk=kk+y)
            {
                for(cc=1;cc<=100;cc=cc+y)
                {
                    for(ccc=1;ccc<=100;ccc=ccc+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }
            /*2 */

            for(kk=1;kk<=100;kk=kk+y)
            {
                for(ccc=1;ccc<=100;ccc=ccc+y)
                {
                    for(cc=1;cc<=100;cc=cc+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }
            /*3 */
            for(cc=1;cc<=100;cc=cc+y)
            {
                for(kk=1;kk<=100;kk=kk+y)
                {
                    for(ccc=1;ccc<=100;ccc=ccc+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }

            /*4 */
            for(cc=1;cc<=100;cc=cc+y)
            {
                for(ccc=1;ccc<=100;ccc=ccc+y)
                {
                    for(kk=1;kk<=100;kk=kk+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }

            /*5 */
            for(ccc=1;ccc<=100;ccc=ccc+y)
            {
                for(kk=1;kk<=100;kk=kk+y)
                {
                    for(cc=1;cc<=100;cc=cc+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }
            /*6 */

            for(ccc=1;ccc<=100;ccc=ccc+y)
            {
                for(cc=1;cc<=100;cc=cc+y)
                {
                    for(kk=1;kk<=100;kk=kk+y)
                    {
                        xxx= (a16*kk/100+a17*cc/100+a18*ccc/100);

                        if ( xxx > a10-.5 && xxx< a10+.5)
                        {
                            kks.add(kk);
                            ccs.add(cc);
                            cccs.add(ccc);
                        }
                    }

                }

            }

            ResultAdapter adapter = new ResultAdapter(getApplicationContext(),kks,ccs,cccs);
            listView.setAdapter(adapter);



        }

    }

    private void FindViewById(){
        amount_of_base_needed = findViewById(R.id.amount_of_base_needed);
        amount_of_binder_needed = findViewById(R.id.amount_of_binder_needed);
        amount_of_loop_needed = findViewById(R.id.amount_of_loop_needed);

        amount_of_base_needed_with_waste_percentage = findViewById(R.id.amount_of_base_needed_with_waste_percentage);
        amount_of_binder_needed_with_waste_percentage = findViewById(R.id.amount_of_binder_needed_with_waste_percentage);
        amount_of_loop_needed_with_waste_percentage = findViewById(R.id.amount_of_loop_needed_with_waste_percentage);

        base_count = findViewById(R.id.base_count);
        base_stitch_length= findViewById(R.id.base_stitch_length);

        binder_count = findViewById(R.id.binder_count);
        binder_stitch_length = findViewById(R.id.binder_stitch_length);

        loop_count = findViewById(R.id.loop_count);
        loop_stitch_length = findViewById(R.id.loop_stitch_length);

        listView = findViewById(R.id.list_view);
    }

}

