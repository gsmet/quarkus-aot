package fr.spacefox.perftests.quarkus.core.service743;

import fr.spacefox.perftests.quarkus.core.port.data.Entity743DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service743.model.Model743;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service743 {

    private final Entity743DatasourcePort datasource;

    public Service743(Entity743DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model743 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
