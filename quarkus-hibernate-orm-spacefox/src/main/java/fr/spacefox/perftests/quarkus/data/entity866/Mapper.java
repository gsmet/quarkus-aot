package fr.spacefox.perftests.quarkus.data.entity866;

import fr.spacefox.perftests.quarkus.core.service866.model.Model866;

final class Mapper {
    private Mapper() {}

    public static Model866 of(Entity866 entity) {
        return new Model866(entity.getId(), entity.getField());
    }
}
