import { Time } from '@angular/common';

export class StockPrice{
    "id":number;
    "companyCode":string;
    "stockExchange":string;
    "currentPrice":string;
    "date":Date;
    "time":Time;
}