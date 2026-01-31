package fr.spacefox.perftests.quarkus.data.entity162;

import fr.spacefox.perftests.quarkus.core.port.data.Entity162DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service162.model.Model162;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity162Repository implements Entity162DatasourcePort, PanacheRepository<Entity162> {
    @Override
    public Optional<Model162> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
