package fr.spacefox.perftests.quarkus.data.entity615;

import fr.spacefox.perftests.quarkus.core.port.data.Entity615DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service615.model.Model615;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity615Repository implements Entity615DatasourcePort, PanacheRepository<Entity615> {
    @Override
    public Optional<Model615> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
