package fr.spacefox.perftests.quarkus.data.entity662;

import fr.spacefox.perftests.quarkus.core.port.data.Entity662DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service662.model.Model662;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity662Repository implements Entity662DatasourcePort, PanacheRepository<Entity662> {
    @Override
    public Optional<Model662> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
