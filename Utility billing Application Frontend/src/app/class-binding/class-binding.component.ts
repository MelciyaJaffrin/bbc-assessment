import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  templateUrl: './class-binding.component.html',
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  isItalic = false;
  isBlueText = false;

  changeTextStyle() {
    this.isItalic = !this.isItalic;
    this.isBlueText = !this.isBlueText;
  }

  sendData(text: any) {
    alert("You typed " + text)
  }
  
  primeMessage: string = ""
  isPrimeOrNot(num: any) {
    let number = num as number;
    let isPrime = true;
    for (let i = 2; i <= Math.sqrt(number); i++) {
      if (number % i === 0) {
        isPrime = false;
        break;
      } else {
        isPrime = true;
      }
    }
    if (isPrime) {
      this.primeMessage = "Prime number";
    } else {
      this.primeMessage = "Not a Prime Number"
    }

  }

}
