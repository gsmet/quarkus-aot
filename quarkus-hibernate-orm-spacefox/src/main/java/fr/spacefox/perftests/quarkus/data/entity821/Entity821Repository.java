package fr.spacefox.perftests.quarkus.data.entity821;

import fr.spacefox.perftests.quarkus.core.port.data.Entity821DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service821.model.Model821;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity821Repository implements Entity821DatasourcePort, PanacheRepository<Entity821> {
    @Override
    public Optional<Model821> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
