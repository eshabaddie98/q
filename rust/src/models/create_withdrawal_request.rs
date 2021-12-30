/*
 * Blockchain.com Exchange REST API
 *
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client). 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateWithdrawalRequest {
    /// The amount to withdraw in the currency specified
    #[serde(rename = "amount", skip_serializing_if = "Option::is_none")]
    pub amount: Option<f64>,
    #[serde(rename = "currency")]
    pub currency: String,
    #[serde(rename = "beneficiary")]
    pub beneficiary: String,
    /// If set, sends the full available amount, minus fees. Amount may not be specified in that case. 
    #[serde(rename = "sendMax", skip_serializing_if = "Option::is_none")]
    pub send_max: Option<bool>,
}

impl CreateWithdrawalRequest {
    pub fn new(currency: String, beneficiary: String) -> CreateWithdrawalRequest {
        CreateWithdrawalRequest {
            amount: None,
            currency,
            beneficiary,
            send_max: None,
        }
    }
}


