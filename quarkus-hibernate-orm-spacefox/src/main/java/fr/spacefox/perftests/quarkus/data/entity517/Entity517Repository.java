package fr.spacefox.perftests.quarkus.data.entity517;

import fr.spacefox.perftests.quarkus.core.port.data.Entity517DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service517.model.Model517;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity517Repository implements Entity517DatasourcePort, PanacheRepository<Entity517> {
    @Override
    public Optional<Model517> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
