package fr.spacefox.perftests.quarkus.data.entity537;

import fr.spacefox.perftests.quarkus.core.port.data.Entity537DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service537.model.Model537;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity537Repository implements Entity537DatasourcePort, PanacheRepository<Entity537> {
    @Override
    public Optional<Model537> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
