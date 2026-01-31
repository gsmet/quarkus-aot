package fr.spacefox.perftests.quarkus.core.service250;

import fr.spacefox.perftests.quarkus.core.port.data.Entity250DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service250.model.Model250;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service250 {

    private final Entity250DatasourcePort datasource;

    public Service250(Entity250DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model250 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
