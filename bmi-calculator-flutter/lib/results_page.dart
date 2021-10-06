import 'package:flutter/material.dart';
import 'constants.dart';
import 'package:bmi_calculator/Reusable_Container.dart';
import 'BottomButton.dart';

class ResultsPage extends StatelessWidget {
  final String bmi;
  final String title;
  final String advice;
  final Color colr;

  ResultsPage(
      {@required this.bmi,
      @required this.title,
      @required this.advice,
      @required this.colr});

  @override
  Widget build(BuildContext context) {
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
                          title,
                          style: TextStyle(
                            color: colr,
                            fontSize: 25,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                        SizedBox(
                          height: 5,
                        ),
                        Text(
                          bmi,
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
                        advice,
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
