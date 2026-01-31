package fr.spacefox.perftests.quarkus.rest.endpoint609;

import fr.spacefox.perftests.quarkus.core.service609.model.Model609;
import fr.spacefox.perftests.quarkus.rest.endpoint609.schema.Schema609;

final class Mapper {
    private Mapper() {}

    public static Schema609 of(Model609 model) {
        return new Schema609(model.id(), model.value());
    }
}
