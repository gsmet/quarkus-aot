package fr.spacefox.perftests.quarkus.rest.endpoint852;

import fr.spacefox.perftests.quarkus.core.service852.model.Model852;
import fr.spacefox.perftests.quarkus.rest.endpoint852.schema.Schema852;

final class Mapper {
    private Mapper() {}

    public static Schema852 of(Model852 model) {
        return new Schema852(model.id(), model.value());
    }
}
