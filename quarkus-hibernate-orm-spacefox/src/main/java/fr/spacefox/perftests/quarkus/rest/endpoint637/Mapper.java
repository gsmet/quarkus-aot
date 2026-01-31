package fr.spacefox.perftests.quarkus.rest.endpoint637;

import fr.spacefox.perftests.quarkus.core.service637.model.Model637;
import fr.spacefox.perftests.quarkus.rest.endpoint637.schema.Schema637;

final class Mapper {
    private Mapper() {}

    public static Schema637 of(Model637 model) {
        return new Schema637(model.id(), model.value());
    }
}
