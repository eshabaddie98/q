/* 
 * Blockchain.com Exchange REST API
 *
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client). 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.com.blockchain.exchange.rest.model
{
    /// <summary>
    /// PriceEvent
    /// </summary>
    [DataContract]
    public partial class PriceEvent :  IEquatable<PriceEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceEvent" /> class.
        /// </summary>
        /// <param name="symbol">Blockchain symbol identifier.</param>
        /// <param name="price24h">price24h.</param>
        /// <param name="volume24h">volume24h.</param>
        /// <param name="lastTradePrice">lastTradePrice.</param>
        public PriceEvent(string symbol = default(string), double price24h = default(double), double volume24h = default(double), double lastTradePrice = default(double))
        {
            this.Symbol = symbol;
            this.Price24h = price24h;
            this.Volume24h = volume24h;
            this.LastTradePrice = lastTradePrice;
        }
        
        /// <summary>
        /// Blockchain symbol identifier
        /// </summary>
        /// <value>Blockchain symbol identifier</value>
        [DataMember(Name="symbol", EmitDefaultValue=false)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets Price24h
        /// </summary>
        [DataMember(Name="price_24h", EmitDefaultValue=false)]
        public double Price24h { get; set; }

        /// <summary>
        /// Gets or Sets Volume24h
        /// </summary>
        [DataMember(Name="volume_24h", EmitDefaultValue=false)]
        public double Volume24h { get; set; }

        /// <summary>
        /// Gets or Sets LastTradePrice
        /// </summary>
        [DataMember(Name="last_trade_price", EmitDefaultValue=false)]
        public double LastTradePrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PriceEvent {\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Price24h: ").Append(Price24h).Append("\n");
            sb.Append("  Volume24h: ").Append(Volume24h).Append("\n");
            sb.Append("  LastTradePrice: ").Append(LastTradePrice).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PriceEvent);
        }

        /// <summary>
        /// Returns true if PriceEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of PriceEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PriceEvent input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Price24h == input.Price24h ||
                    (this.Price24h != null &&
                    this.Price24h.Equals(input.Price24h))
                ) && 
                (
                    this.Volume24h == input.Volume24h ||
                    (this.Volume24h != null &&
                    this.Volume24h.Equals(input.Volume24h))
                ) && 
                (
                    this.LastTradePrice == input.LastTradePrice ||
                    (this.LastTradePrice != null &&
                    this.LastTradePrice.Equals(input.LastTradePrice))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Symbol != null)
                    hashCode = hashCode * 59 + this.Symbol.GetHashCode();
                if (this.Price24h != null)
                    hashCode = hashCode * 59 + this.Price24h.GetHashCode();
                if (this.Volume24h != null)
                    hashCode = hashCode * 59 + this.Volume24h.GetHashCode();
                if (this.LastTradePrice != null)
                    hashCode = hashCode * 59 + this.LastTradePrice.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {

            
            // Symbol (string) pattern
            Regex regexSymbol = new Regex(@"^[A-Z]{3,5}-[A-Z]{3,5}$", RegexOptions.CultureInvariant);
            if (false == regexSymbol.Match(this.Symbol).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Symbol, must match a pattern of " + regexSymbol, new [] { "Symbol" });
            }

            yield break;
        }
    }

}
