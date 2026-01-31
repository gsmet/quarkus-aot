package fr.spacefox.perftests.quarkus.data.entity887;

import fr.spacefox.perftests.quarkus.core.service887.model.Model887;

final class Mapper {
    private Mapper() {}

    public static Model887 of(Entity887 entity) {
        return new Model887(entity.getId(), entity.getField());
    }
}
