import 'package:bmi_calculator/providers/bmi_provider.dart';
import 'package:flutter/material.dart';
import '../utils/colors.dart';
import '../utils/text_styles.dart';
import 'package:bmi_calculator/widgets/Reusable_Container.dart';
import '../widgets/BottomButton.dart';
import 'package:provider/provider.dart';

class ResultsPage extends StatelessWidget {
  BMIProvider bmiProvider;

  @override
  Widget build(BuildContext context) {
    bmiProvider = context.watch<BMIProvider>();
    return Scaffold(
        appBar: AppBar(
          title: Text(
            '          BMI Calculator',
            style: TextStyle(
              fontSize: 25,
            ),
          ),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Expanded(
              flex: 1,
              child: Container(
                padding: EdgeInsets.all(15),
                child: Center(
                  child: Text(
                    'Your Result',
                    style: kTitleTextStyle,
                  ),
                ),
              ),
            ),
            Expanded(
              flex: 5,
              child: ReusableContainer(
                colr: kActiveColor,
                cardChild: Column(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children: [
                    Column(
                      children: [
                        Text(
                          bmiProvider.title.toString(),
                          style: TextStyle(
                            color: bmiProvider.color,
                            fontSize: 25,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                        SizedBox(
                          height: 5,
                        ),
                        Text(
                          bmiProvider.bmi.toString(),
                          style: kBMIfont,
                        ),
                      ],
                    ),
                    Column(
                      children: [
                        Text(
                          'Normal BMI range :',
                          style: TextStyle(
                            fontSize: 25,
                            fontWeight: FontWeight.bold,
                            color: Colors.blueGrey,
                          ),
                        ),
                        SizedBox(
                          height: 7,
                        ),
                        Text(
                          '18.5 - 25 Kg/m\u00B2',
                          style: TextStyle(
                            fontSize: 26,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ],
                    ),
                    Padding(
                      padding: const EdgeInsets.all(8.0),
                      child: Text(
                        bmiProvider.advice.toString(),
                        textAlign: TextAlign.center,
                        style: TextStyle(
                          fontSize: 26,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ),
            SizedBox(
              height: 5,
            ),
            BottomButton(
              text: 'RE-CALCULATE BMI',
              onTap: () {
                Navigator.pop(context);
              },
            ),
          ],
        ));
  }
}
