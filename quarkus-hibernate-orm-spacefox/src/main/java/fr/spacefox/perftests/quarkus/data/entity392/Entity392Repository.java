package fr.spacefox.perftests.quarkus.data.entity392;

import fr.spacefox.perftests.quarkus.core.port.data.Entity392DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service392.model.Model392;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity392Repository implements Entity392DatasourcePort, PanacheRepository<Entity392> {
    @Override
    public Optional<Model392> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
