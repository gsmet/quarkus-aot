package fr.spacefox.perftests.quarkus.data.entity637;

import fr.spacefox.perftests.quarkus.core.service637.model.Model637;

final class Mapper {
    private Mapper() {}

    public static Model637 of(Entity637 entity) {
        return new Model637(entity.getId(), entity.getField());
    }
}
