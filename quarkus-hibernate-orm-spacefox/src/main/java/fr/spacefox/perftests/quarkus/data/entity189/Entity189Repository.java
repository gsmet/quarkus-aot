package fr.spacefox.perftests.quarkus.data.entity189;

import fr.spacefox.perftests.quarkus.core.port.data.Entity189DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service189.model.Model189;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity189Repository implements Entity189DatasourcePort, PanacheRepository<Entity189> {
    @Override
    public Optional<Model189> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
