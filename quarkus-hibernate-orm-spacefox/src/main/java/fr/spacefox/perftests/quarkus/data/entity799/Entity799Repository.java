package fr.spacefox.perftests.quarkus.data.entity799;

import fr.spacefox.perftests.quarkus.core.port.data.Entity799DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service799.model.Model799;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity799Repository implements Entity799DatasourcePort, PanacheRepository<Entity799> {
    @Override
    public Optional<Model799> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
