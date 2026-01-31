package fr.spacefox.perftests.quarkus.rest.endpoint887;

import fr.spacefox.perftests.quarkus.core.service887.model.Model887;
import fr.spacefox.perftests.quarkus.rest.endpoint887.schema.Schema887;

final class Mapper {
    private Mapper() {}

    public static Schema887 of(Model887 model) {
        return new Schema887(model.id(), model.value());
    }
}
