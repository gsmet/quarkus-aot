package fr.spacefox.perftests.quarkus.data.entity995;

import fr.spacefox.perftests.quarkus.core.port.data.Entity995DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service995.model.Model995;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity995Repository implements Entity995DatasourcePort, PanacheRepository<Entity995> {
    @Override
    public Optional<Model995> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
