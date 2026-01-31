package fr.spacefox.perftests.quarkus.data.entity840;

import fr.spacefox.perftests.quarkus.core.port.data.Entity840DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service840.model.Model840;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity840Repository implements Entity840DatasourcePort, PanacheRepository<Entity840> {
    @Override
    public Optional<Model840> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
