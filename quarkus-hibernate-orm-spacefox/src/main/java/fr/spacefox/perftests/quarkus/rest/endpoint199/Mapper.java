package fr.spacefox.perftests.quarkus.rest.endpoint199;

import fr.spacefox.perftests.quarkus.core.service199.model.Model199;
import fr.spacefox.perftests.quarkus.rest.endpoint199.schema.Schema199;

final class Mapper {
    private Mapper() {}

    public static Schema199 of(Model199 model) {
        return new Schema199(model.id(), model.value());
    }
}
