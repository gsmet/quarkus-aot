package fr.spacefox.perftests.quarkus.core.service781;

import fr.spacefox.perftests.quarkus.core.port.data.Entity781DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service781.model.Model781;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service781 {

    private final Entity781DatasourcePort datasource;

    public Service781(Entity781DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model781 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
