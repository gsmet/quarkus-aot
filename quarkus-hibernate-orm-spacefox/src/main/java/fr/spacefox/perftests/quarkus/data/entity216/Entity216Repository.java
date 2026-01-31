package fr.spacefox.perftests.quarkus.data.entity216;

import fr.spacefox.perftests.quarkus.core.port.data.Entity216DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service216.model.Model216;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity216Repository implements Entity216DatasourcePort, PanacheRepository<Entity216> {
    @Override
    public Optional<Model216> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
