package fr.spacefox.perftests.quarkus.rest.endpoint543;

import fr.spacefox.perftests.quarkus.core.service543.model.Model543;
import fr.spacefox.perftests.quarkus.rest.endpoint543.schema.Schema543;

final class Mapper {
    private Mapper() {}

    public static Schema543 of(Model543 model) {
        return new Schema543(model.id(), model.value());
    }
}
