package fr.spacefox.perftests.quarkus.core.service213;

import fr.spacefox.perftests.quarkus.core.port.data.Entity213DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service213.model.Model213;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service213 {

    private final Entity213DatasourcePort datasource;

    public Service213(Entity213DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model213 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
