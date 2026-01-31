package fr.spacefox.perftests.quarkus.rest.endpoint116;

import fr.spacefox.perftests.quarkus.core.service116.model.Model116;
import fr.spacefox.perftests.quarkus.rest.endpoint116.schema.Schema116;

final class Mapper {
    private Mapper() {}

    public static Schema116 of(Model116 model) {
        return new Schema116(model.id(), model.value());
    }
}
