package fr.spacefox.perftests.quarkus.rest.endpoint680;

import fr.spacefox.perftests.quarkus.core.service680.model.Model680;
import fr.spacefox.perftests.quarkus.rest.endpoint680.schema.Schema680;

final class Mapper {
    private Mapper() {}

    public static Schema680 of(Model680 model) {
        return new Schema680(model.id(), model.value());
    }
}
