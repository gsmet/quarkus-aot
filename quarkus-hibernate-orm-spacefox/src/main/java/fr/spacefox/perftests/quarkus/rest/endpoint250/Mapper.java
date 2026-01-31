package fr.spacefox.perftests.quarkus.rest.endpoint250;

import fr.spacefox.perftests.quarkus.core.service250.model.Model250;
import fr.spacefox.perftests.quarkus.rest.endpoint250.schema.Schema250;

final class Mapper {
    private Mapper() {}

    public static Schema250 of(Model250 model) {
        return new Schema250(model.id(), model.value());
    }
}
