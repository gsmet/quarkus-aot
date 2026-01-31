package fr.spacefox.perftests.quarkus.data.entity836;

import fr.spacefox.perftests.quarkus.core.port.data.Entity836DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service836.model.Model836;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity836Repository implements Entity836DatasourcePort, PanacheRepository<Entity836> {
    @Override
    public Optional<Model836> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
