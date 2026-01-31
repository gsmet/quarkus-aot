package fr.spacefox.perftests.quarkus.data.entity747;

import fr.spacefox.perftests.quarkus.core.port.data.Entity747DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service747.model.Model747;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity747Repository implements Entity747DatasourcePort, PanacheRepository<Entity747> {
    @Override
    public Optional<Model747> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
