package fr.spacefox.perftests.quarkus.data.entity116;

import fr.spacefox.perftests.quarkus.core.port.data.Entity116DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service116.model.Model116;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity116Repository implements Entity116DatasourcePort, PanacheRepository<Entity116> {
    @Override
    public Optional<Model116> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
