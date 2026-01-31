package fr.spacefox.perftests.quarkus.data.entity808;

import fr.spacefox.perftests.quarkus.core.port.data.Entity808DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service808.model.Model808;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity808Repository implements Entity808DatasourcePort, PanacheRepository<Entity808> {
    @Override
    public Optional<Model808> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
