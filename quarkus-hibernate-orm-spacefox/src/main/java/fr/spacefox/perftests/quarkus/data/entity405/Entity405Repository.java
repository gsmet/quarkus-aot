package fr.spacefox.perftests.quarkus.data.entity405;

import fr.spacefox.perftests.quarkus.core.port.data.Entity405DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service405.model.Model405;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity405Repository implements Entity405DatasourcePort, PanacheRepository<Entity405> {
    @Override
    public Optional<Model405> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
