package fr.spacefox.perftests.quarkus.core.service843;

import fr.spacefox.perftests.quarkus.core.port.data.Entity843DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service843.model.Model843;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service843 {

    private final Entity843DatasourcePort datasource;

    public Service843(Entity843DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model843 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
