package fr.spacefox.perftests.quarkus.data.entity194;

import fr.spacefox.perftests.quarkus.core.port.data.Entity194DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service194.model.Model194;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity194Repository implements Entity194DatasourcePort, PanacheRepository<Entity194> {
    @Override
    public Optional<Model194> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
