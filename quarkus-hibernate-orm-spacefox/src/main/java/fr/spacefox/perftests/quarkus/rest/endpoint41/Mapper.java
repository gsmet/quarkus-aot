package fr.spacefox.perftests.quarkus.rest.endpoint41;

import fr.spacefox.perftests.quarkus.core.service41.model.Model41;
import fr.spacefox.perftests.quarkus.rest.endpoint41.schema.Schema41;

final class Mapper {
    private Mapper() {}

    public static Schema41 of(Model41 model) {
        return new Schema41(model.id(), model.value());
    }
}
