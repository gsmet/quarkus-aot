package fr.spacefox.perftests.quarkus.data.entity180;

import fr.spacefox.perftests.quarkus.core.port.data.Entity180DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service180.model.Model180;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity180Repository implements Entity180DatasourcePort, PanacheRepository<Entity180> {
    @Override
    public Optional<Model180> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
