package fr.spacefox.perftests.quarkus.data.entity672;

import fr.spacefox.perftests.quarkus.core.port.data.Entity672DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service672.model.Model672;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity672Repository implements Entity672DatasourcePort, PanacheRepository<Entity672> {
    @Override
    public Optional<Model672> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
