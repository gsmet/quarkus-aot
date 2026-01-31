package fr.spacefox.perftests.quarkus.rest.endpoint202;

import fr.spacefox.perftests.quarkus.core.service202.model.Model202;
import fr.spacefox.perftests.quarkus.rest.endpoint202.schema.Schema202;

final class Mapper {
    private Mapper() {}

    public static Schema202 of(Model202 model) {
        return new Schema202(model.id(), model.value());
    }
}
