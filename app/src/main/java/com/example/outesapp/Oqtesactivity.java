package com.example.outesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Oqtesactivity extends AppCompatActivity {

    RecyclerView rcv1;
    TextView txtname;

    ArrayList<modelqoutes> w=new ArrayList<>();
    String obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_oqtesactivity );
        Initview();
    }

    private void Initview() {
        txtname = findViewById( R.id.txtname );
        rcv1 = findViewById( R.id.rcv1 );

        if (getIntent() != null) {
            obj = getIntent().getStringExtra( "categories" );
            txtname.setText( obj );

            if (obj.equals("Mother")) {
                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("“My mother is a walking miracle.” " );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("“A mother understands what a child does not say.” " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("“The world needs our mothers.” " );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("દુનિયાની બધી ભાષાઓમાં “માં” નો અર્થ તો “માં” જ થાય છે..");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("There is nothing as sincere as a mother's kiss.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("Life began with waking up and loving my mother's face." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("Always my mother; forever my friend." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("આ દુનિયામાં કોઈ પણ સ્વાર્થ વગર માત્ર માં જ પ્રેમ કરી શકે છે.");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("We are born of love, love is our mother" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("The mother’s heart is the child’s school-room" );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("We are born of love, love is our mother" );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("જે ઘરમાં માં છે, ત્યાં બધું જ સારું હોય છે." );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("Make time to have fun with her kids." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("Being a mother is learning about strengths you didn’t know you had" );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Mothers possess a power beyond that of a king on his throne" );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("જનનીની જોડ સખી નહી જડે રે લોલ" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("There’s no place like home except Grandma’s." );
                w.add( m17 );

            }
            if (obj.equals("Father")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Dad: A son's first hero, a daughter's first love. " );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("The power of a dad in a child's life is unmatched. " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("It is a wise father that knows his own child. " );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("પિતા વગરની જિંદગી એટલે\n" +
                        "ભગવાન વગરનું મંદિર");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("A girl's first true love is her father.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("A father is someone you look up to no matter how tall you grow." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("Morning without you is a dwindled dawn.." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("સપના તો મારા હતા\n" +
                        "પણે એને દિશા આપનાર મારા પિતા હતા..");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("Everyone has an uncle who tried to steal their nosea" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Every great achiever is inspired by a great mentor." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("Fatherhood is a marathon, not a sprint.." );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("વડલાની જેમ તાપ સહન કરી,\n" +
                        "પરિવારને છાંંયડો આપતુ પાત્ર એટલે પિતા." );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("Only the best brothers get promoted to an uncle.." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("Fathers are the first friend you make and the last love of your life." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("he value of a loving father has no price." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("વડલાની જેમ તાપ સહન કરી,\n" +
                        "પરિવારને છાંંયડો આપતુ પાત્ર એટલે પિતા" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("A father's love is eternal and without end" );
                w.add( m17 );


            }
            if (obj.equals("Sister")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Of two sisters one is always the watcher, one the dancer." );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("Sisters become more beautiful as each day passes by." );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("A sister travels with you always." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("બહેન એટલે\n" +
                        "\" કિટા થી લઈ બીચ્ચા સુધીનો સંબંધ \"");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("You can kid the world, but not your sister.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("Sisters make the best friends in the world." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("How do people make it through life without a sister?" );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("બહેન એટલે...\n" +
                        "\" મમ્મીનું Update Version .");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("Of two sisters one is always the watcher, one the dancer." );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Sisters become more beautiful as each day passes by.." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("A sister is a friend you don’t have to avoid the truth with." );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("બહેન એટલે \n" +
                        "\" જ્યારે કોઈ નથી હોતું ને,\n" +
                        "ત્યારે એ બહેન હોય છે. \"." );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("In the cookies of life, sisters are the chocolate chips." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("Sweet is the voice of a sister in the season of sorrow." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("There is no place for secrets in sisterhood." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("બહેન એટલે...\n" +
                        "\" ભાઈની તાકાત અને ભાઈનો સહારો \"\n" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("A sister is both your mirror—and your opposite" );
                w.add( m17 );


            }
            if (obj.equals("Sad")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Life is a moderately good play with a badly written third act.”" );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("Tears are words that need to be written" );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("The word ‘happy’ would lose its meaning if it were not balanced by sadness." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("કદાચ લોકો નઇ\n" +
                        "પણ ફક્ત તું તો સમજી શકેને?\n" +
                        "કે ચૂપ રહેતા ને પણ\n" +
                        "દુઃખ તો થાય જ \"");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("Don’t cry over someone who wouldn’t cry over you.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("First, accept sadness. Realize that without losing, winning isn’t so great" );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("Don’t cry because it’s over, smile because it happened" );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("ચા સાથે બિસ્કિટે પણ એક શીખ આપી\n" +
                        "કોઈની વાતો માં\n" +
                        "ઊંડા ઉતરશો તો તૂટી જશો.");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("There are years that ask questions and years that answer" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Sadness flies away on the wings of time.." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("I know how to love you, but not how to stop loving you" );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("તારા પછી જેના થસુ\n" +
                        "એનું નામ મજબૂરી હશે" );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("I always like walking in the rain, so no one can see me crying" );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("When you feel sad, it's okay." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Tears come from the heart and not from the brain." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("આજે વરસાદ નું વાતાવરણ છે \n" +
                        "આનાથી પણ સારું કોઈ હતું મારુ\n" +
                        "જે બદલાઈ ગયું" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("The good times of today, are the sad thoughts of tomorrow." );
                w.add( m17 );


            }
            if (obj.equals("Angry")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("I am not available for busy people. " );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("Hey you, I am hurt. I am not angry, and there’s a big difference." );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("My existence is for myself; I do not exist to impress others,." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("કજિંદગીમાં ક્યારેય કોઈ હારતું જ નથી\n" +
                        "કાં તો જીતે છે, કાં તો શીખે છે\"");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("The best way to get someone’s attention is to stop giving them your attention.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("I am angry; it is a feeling that makes your tongue work faster than the brain." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("Life is short, don’t waste it on me." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("ઓ સમય, જરા ધીરે ચાલ,\n" +
                        "હજી ઘણાં લોકો ને એમની ઓકાત દેખાડવાની છે મારે !!");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("You lose your importance in their life when you give lots of importance to them" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Quit talking to me if you don’t like my attitude." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("You do not need to explain, I know who I am," );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("શાંત સમજીને ઓલવવાની કોશિશ ના કરશો તમે….જો ભડક્યો ને તો રાખ કરી નાખીશ !!" );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("I’ll leave you like a choice if you treat me like an option." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("My life, my attitude" );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Maybe I am not perfect, but I am always me." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("મારી ખામોશી પર ના જશો સાહેબ, રાખની નીચે પણ આગ સળગતી હોય છે !!" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("Hey you! I found something under my shoes; oh, it’s your fucking attitude." );
                w.add( m17 );


            }
            if (obj.equals("Love")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("“Love all, trust a few, do wrong to none.”" );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("You call it madness, but I call it love" );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("We can only learn to love by loving." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("પ્રેમ હમેશા સ્વભાવ ને અનુભવી ને થાય છે,\n" +
                        "ચેહરો જોઈ માત્ર પસંદગી જ થાય છે.");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("A life lived in love will never be dull.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("Life is the flower for which love is the honey." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("All you need is love." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("બહુ જ સુંદર હોય છે એ પ્રેમ,\n" +
                        "જેની શરૂઆત દોસ્તી થી થાય છે !!");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("True love stories never have endings" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Grow old along with me; the best is yet to be" );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("To love is to burn, to be on fire." );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("કોઈ અજાણ્યા સાથે પણ પ્રેમ થઇ જાય છે,\n" +
                        "તો કોઈ પ્રેમ કરી ને પણ અજાણ્યા થઇ જાય છે.\n" +
                        "\n" );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("Love is so short, forgetting is so long" );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("Love is a thing that is full of cares and fears." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Love is not love until love’s vulnerable." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("જિંદગી ભર સાથ નહિ આપે તો ચાલે,\n" +
                        "પણ એટલી યાદ આપી જજે કે આ જિંદગી નીકળી જાય" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("Love is the magician that pulls man out of his own hat" );
                w.add( m17 );


            }
            if (obj.equals("Car")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("A fast car can make women 'like' a man; and a man 'like' women … " );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("A muscle is like a car." );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("I love the wheels, I mean steering wheel" );
                w.add( m21);




                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("Never lend your car to anyone to whom you have given birth");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("Cars are the sculptures of our everyday lives." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("“I thought cars were essential ingredients of life itself." );
                w.add( m6 );



                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("Cars are the reason we, you know, people live or die" );
                w.add( m9 );



                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("“I’m a crazy car guy. I’ve got an airplane hangar full of cars.." );
                w.add( m11 );





                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("I love vintage cars because you can do so much more to them." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("A racing car is an animal with a thousand adjustments" );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Fast cars like Porsches and Ferraris – they are things of beauty." );
                w.add( m15 );




                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("I love fast cars… and to go too fast in them." );
                w.add( m17 );


            }
            if (obj.equals("Enjoy")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("In order to write about life first you must live it." );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("The unexamined life is not worth living" );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("Turn your wounds into wisdom" );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("ખરાબ સમયમાં ખભા ૫ર મુકેલ હાથ સફળતાની તાળીઓ કરતાં ૫ણ મુલ્યવાન હોય છે..");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("Not how long, but how well you have lived is the main thing");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("If you want to live a happy life, tie it to a goal, not to people or things" );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("Never let the fear of striking out keep you from playing the game." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("બોલવાનુું શીખી લો, નહિંતર જીંદગીભર સાંભળતા રહી જશો.");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("You only live once, but if you do it right, once is enough." );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Get busy living or get busy dying" );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("The purpose of our lives is to be happy." );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("સંસારમાં મનુષ્ય માત્ર એક એવુ પ્રાણી છે જેનું ઝેર શબ્દોમાં હોય છે." );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("Learn to enjoy every minute of your life." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("You'll miss the best things if you keep your eyes shut." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Life is too short not to nurture your inner child." );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("માત્ર સંતોષ શોઘો, જરૂરતો કયારેય પુરી નથી થતી." );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("Don't take life too seriously" );
                w.add( m17 );


            }
            if (obj.equals("Friends")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Friends are those rare people who ask how we are and then wait to hear the answer.” — ..." );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("A friend knows the song in my heart and sings it to me when my memory fails.” " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("It's the friends you can call up at 4 a.m. that matter." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("જો તાજમહેલ પ્રેમનું પ્રતિક છે,\n" +
                        "તો અડધી ચા દોસ્તીનું પ્રતિક છે ");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("Truly great friends are hard to find, difficult to leave, and impossible to forget");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("“It’s not what we have in life, but who we have in our life that matters" );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("To the world you may be just one person, but to one person you may be the world." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("જનો દિવસ એમના નામે,\n" +
                        "જે કિસ્મતથી મળ્યા છે કિંમતથી નહીં”");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("A friend is one of the best things you can be and the greatest things you can have.”\n" +
                        "\n" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Time doesn’t take away from friendship, nor does separation." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("Truly great friends are hard to find, difficult to leave, and impossible to forget." );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("જો તાજમહેલ પ્રેમનું પ્રતિક છે,\n" +
                        "તો અડધી ચા દોસ્તીનું પ્રતિક છે" );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("A good friend is like a four-leaf clover; hard to find and lucky to have.." );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("True friends are never apart, maybe in distance but never in heart." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("“No friendship is an accident" );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("પ્રેમના સંબંધો કરતા,\n" +
                        "દોસ્તીના સંબંધો વધારે મીઠા હોય”" );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("Friends are the siblings God never gave us" );
                w.add( m17 );


            }
            if (obj.equals("Happy")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Happiness depends upon ourselves." );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("The moments of happiness we enjoy take us by surprise. ...” " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("Even if happiness forgets you a little bit, never completely forget about it" );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("જ્યારે ખીસામાં માં “રૂપિયા” હોય ને ત્યારે,\n" +
                        "કુંડળીમાં “શનિ” હોવાથી કઈ જ ફર્ક નથી પડતો. ");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("One of the secrets of a happy life is continuous small treats");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("The only joy in the world is to begin." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("It is only possible to live happily ever after on a daily basis" );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("વિશ્વને બદલવા માટે તમારી સ્મિતનો ઉપયોગ કરો; વિશ્વને તમારી સ્મિત બદલવા ન દો.");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("The pleasure which we most rarely experience gives us greatest delight”\n" +
                        "\n" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Remember this, that very little is needed to make a happy life." );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("I wake up every morning with a great desire to live joyfully" );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("જે વ્યક્તિ પોતાને Control કરી શકે છે,\n" +
                        "તે જીવનમાં કંઈપણ કરી શકે છે." );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("The purpose of our lives is to be happy. " );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("Get busy living or get busy dying" );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("You only live once, but if you do it right, once is enough" );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("જ્યાં સુધી તમે ડરતા રહેશો ત્યાં સુધી તમારા જીવનના નિર્ણયો બીજા લોકો જ લેતા રહેશે." );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("If you want to live a happy life, tie it to a goal, not to people or things" );
                w.add( m17 );


            }
            if (obj.equals("beard")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("My beard is my identity so I cannot here any single about my identity." );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes(" I'm a beard lover because I'm a bearded man " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("Attitude comes from my beard and my beard is my life. " );
                w.add( m21);


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes(" some girls want cute and clean checks but I love the beard.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("Beard is fashion and I'm a fashion boy." );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("I don't have any girlfriend but My beard is my everything." );
                w.add( m6 );



                modelqoutes m9 = new modelqoutes();
                m9.setQuotes(" I love my beard more than my girlfriend because It shows my identityn" +
                        "\n" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("our look should be like your profession but the beard is for all the professions" );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("I'm a bearded man because I accept that I'm a man." );
                w.add( m11 );



                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("every man should have a beard because it makes more power.. " );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("My beard gives me the power to face any problem." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes(" I love to do the gym that's why I love the beard" );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("Beard Love " );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("I hate those who said that I don't like a beard." );
                w.add( m17 );


            }
            if (obj.equals("Attitude")){

                modelqoutes m1 = new modelqoutes();
                m1.setQuotes("Just do it! People will talk anyway…L" );
                w.add( m1 );

                modelqoutes m2 = new modelqoutes();
                m2.setQuotes("If opportunity doesn’t knock, build a door  " );
                w.add( m2 );

                modelqoutes m21 = new modelqoutes();
                m21.setQuotes("I lose interest when I get ignored." );
                w.add( m21);

                modelqoutes m3 = new modelqoutes();
                m3.setQuotes("લોકો લાખોમાં એક હોય છે, પણ હું તો કરોડોમાં એક છું! ... ");
                w.add( m3 );


                modelqoutes m4 = new modelqoutes();
                m4.setQuotes("SOMETIMES A KING HAS TO REMIND FOOLS WHY HE IS KING.");
                w.add( m4 );


                modelqoutes m5 = new modelqoutes();
                m5.setQuotes("o be an overachiever you have to be an over-believer " );
                w.add( m5 );


                modelqoutes m6 = new modelqoutes();
                m6.setQuotes("I don’t keep secrets; I just keep people out of my business." );
                w.add( m6 );

                modelqoutes m7 = new modelqoutes();
                m7.setQuotes("કોઈએ પૂછ્યું કોના માટે લખો છો, મેં કહ્યું જે સમજે એના માટે!");
                w.add(m7);

                modelqoutes m9 = new modelqoutes();
                m9.setQuotes("The pleasure which we most rarely experience gives us greatest delight”\n" +
                        "\n" );
                w.add( m9 );


                modelqoutes m10 = new modelqoutes();
                m10.setQuotes("Start where you are. Use what you have. Do what you can" );
                w.add( m10 );

                modelqoutes m11 = new modelqoutes();
                m11.setQuotes("Weakness of attitude becomes weakness of character" );
                w.add( m11 );


                modelqoutes m12 = new modelqoutes();
                m12.setQuotes("અમે કોઈના દીવાના નથી દુનિયા અમારી દિવાની છે" );
                w.add( m12 );

                modelqoutes m13 = new modelqoutes();
                m13.setQuotes("KEEP YOUR STRUGGLE A SECRET, UNTIL YOU SUCCEED. " );
                w.add( m13 );


                modelqoutes m14 = new modelqoutes();
                m14.setQuotes("All your dreams can come true f you have the courage to purse them." );
                w.add( m14 );

                modelqoutes m15 = new modelqoutes();
                m15.setQuotes("Changing your mindset is a game changer" );
                w.add( m15 );

                modelqoutes m16 = new modelqoutes();
                m16.setQuotes("જ્યાં સુધી તમે ડરતા રહેશો ત્યાં સુધી તમારા જીવનના નિર્ણયો બીજા લોકો જ લેતા રહેશે." );
                w.add( m16 );


                modelqoutes m17 = new modelqoutes();
                m17.setQuotes("You are never too old to set another goal or dream a new dream.” " );
                w.add( m17 );


            }




            oqtescatadpter adapter = new oqtescatadpter( Oqtesactivity.this, w );
            rcv1.setAdapter( adapter );
            LinearLayoutManager manger = new LinearLayoutManager( Oqtesactivity.this, LinearLayoutManager.VERTICAL, false );
            rcv1.setLayoutManager(manger);
        }
    }

}