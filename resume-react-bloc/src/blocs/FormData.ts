import { BehaviorSubject } from "rxjs";

export class FormBloc {
  subject: BehaviorSubject<ResumeFormConcept>;
  constructor() {
    this.subject = new BehaviorSubject<ResumeFormConcept>({
      address: [],
      education: [],
      email: "",
      experience: [],
      firstName: "",
      lastName: "",
      phone: "",
      skills: [],
    });
  }
}

export const bloc = new FormBloc();

/**
 *
 */
export type ResumeFormConcept = {
  firstName: string;
  lastName: string;
  email: string;
  phone: string;
  address: string[];
  education: Education[];
  experience: Experience[];
  skills: string[];
  description?: string;
};

export interface Education {
  institue: string;
  course: string;
  year: string;
}
export interface Experience {
  company: string;
  year: string;
}
