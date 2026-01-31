package fr.spacefox.perftests.quarkus.data.entity386;

import fr.spacefox.perftests.quarkus.core.port.data.Entity386DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service386.model.Model386;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity386Repository implements Entity386DatasourcePort, PanacheRepository<Entity386> {
    @Override
    public Optional<Model386> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
