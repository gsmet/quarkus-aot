package fr.spacefox.perftests.quarkus.data.entity295;

import fr.spacefox.perftests.quarkus.core.port.data.Entity295DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service295.model.Model295;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity295Repository implements Entity295DatasourcePort, PanacheRepository<Entity295> {
    @Override
    public Optional<Model295> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
