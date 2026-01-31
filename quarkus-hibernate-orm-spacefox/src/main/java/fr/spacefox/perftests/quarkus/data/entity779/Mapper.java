package fr.spacefox.perftests.quarkus.data.entity779;

import fr.spacefox.perftests.quarkus.core.service779.model.Model779;

final class Mapper {
    private Mapper() {}

    public static Model779 of(Entity779 entity) {
        return new Model779(entity.getId(), entity.getField());
    }
}
